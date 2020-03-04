/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */

fun main(args:Array<String>){
    var n1=10
    var n2=20
//    var max
    /*if(n1>n2){
        max = n1;
    }else{
        max=n2;
    }*/

    var max = if(n1>n2) n1 else n2
    println("max: $max")

    //When

    var age=30
    var isYoung= when(age){
        30-> true
        else->false
    }
    println("is young: $isYoung")
}