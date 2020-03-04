/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){
    var count =6
    do{

        println("count: $count")

        if(count%2==0){
            println("Number is even: $count")
        }

        count++
    }while(count <= 5)
}