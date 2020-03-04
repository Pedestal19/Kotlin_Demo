/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */
/*
Operations rules | Priorities rules
1- ()
2- ++, -- (before Var)
3- ^
4- * , /
5- + , -
6- =
7- ++, -- (After var)
 */
fun main(args:Array<String>){

    var x=10
    var y=11
    var z = --x+y
    println("z: $z")

//  x=9, y=11
    var m=x+++y
    println("m:$m")
    println("After x:$x")

}