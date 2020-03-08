/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun sum(n1:Double, n2:Double):Double{

    var sum = n1+n2
    return sum
}

fun display(n:Int=0): Unit{
    println("n: $n")
}

fun displayNoInput(): Unit{
    println("Welcome to display")
}

fun main(args:Array<String>){

    var r = sum(10.4, 14.8)
    println("r: $r")

    r = sum(5.0, 80.0)
    println("r: $r")

    r = sum(12.5, 17.5)
    println("r: $r")

    display(10)
    display()

}