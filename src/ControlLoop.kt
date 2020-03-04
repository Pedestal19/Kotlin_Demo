/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){

    for(count in 1..10){
            if(count == 4) {
                continue
            }
        println("count: $count")

    }

    println("first loop done")

    for(count2 in 1..10){
        if(count2 == 4) {
            break
        }
        println("count2: $count2")

    }

    println("second loop done")

    loop@ for(count3 in 1..10){

        for(count4 in 1..5){
            println("count3: $count3")
            if(count4 == 4) {
                break@loop
            }
        }


    }

    println("third loop done")
}