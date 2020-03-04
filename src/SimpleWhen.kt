/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){

    var x=30;

    when(x){
        1,2-> print("Value is 1 or 2")
        in 10..30-> print("Value is in 10-30 range")
        !in 10..30-> print("Value is not in 10-30 range")
        else ->{
            println("value is out of range")
        }
    }

}