/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){

    println("enter your grade")
    var grade= readLine()!!.toDouble();

    if(grade>=90){
        grade=grade+3
        println("You are in A level")
    }

    if(grade>=50 && grade <=70){
        grade=grade+10
        println("You get an extra 10 point")
    }

    println("you enter grade $grade")
}