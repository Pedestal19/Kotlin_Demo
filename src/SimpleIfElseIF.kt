/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){
    print("enter your grade: ")
    var grade= readLine()!!.toDouble();

    if(grade>=90){
        grade=grade+3
        println("You are in A level")
    }else if (grade >=80 && grade <90){
        println("You are in B level")
    }
    else if(grade >=70 && grade <80){
        println("You are in C level")
    }
    else{
        println("You fail")
    }

}
