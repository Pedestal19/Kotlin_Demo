/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

/*
Operations rules | Priorities rules
1- ()
2- ^
3- * , /
4- + , -
5- =
 */
fun main(args:Array<String>){

    var number1:Int=10
    var number2:Int=10
    var number3:Int=5
    var sum:Int?
    sum = (number1+number2)*number3-3;
    print("sum: $sum")
}