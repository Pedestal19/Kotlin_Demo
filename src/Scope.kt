/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

var fullname="Hosanna Gabe-Oji"  //global var

fun display():Unit{
    println(fullname)
//    print("name:" +name)
}

fun main(args:Array<String>){
    var name="Hosanna" //local var
    println(fullname)
    print("name: "+name)
}