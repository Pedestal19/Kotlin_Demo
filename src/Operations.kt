/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){

    println("---- Math calculator -----")
    print("Enter number 1:")
    var number1:Float= readLine()!!.toFloat()
    print("Enter number 2:")
    var number2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum=number1+number2
    print("sum:"+sum)
}