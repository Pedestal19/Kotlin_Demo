/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){

    print("enter your grade: ")
    var grade= readLine()!!.toDouble();

    if(grade>=90){

        if(grade < 93){
            println("You are in A- level")
        }else{
            println("You are in A+ level")
        }
    }


}