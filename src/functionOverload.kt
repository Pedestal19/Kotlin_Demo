/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun sum(n1:Int, n2:Int):Int{

    return n1+n2
}

fun sum(n1:Int, n2:Int, n3:Int):Int{

    return n1+n2+n3
}

fun sum(n1:Int, n2:Int, n3:Int, n4:Int):Int{

    return n1+n2+n3+n4
}



fun main(args:Array<String>){

    println(sum(10,11))
    println(sum(10,11, 15))
    println(sum(10,11, 15, 19))


}