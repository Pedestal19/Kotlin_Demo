/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun show(name:String):Unit{
    println("name: "+name)
}

fun show(number:Int):Unit{
    println("number: "+number)
}

fun show(numberD:Double):Unit{
    println("numberD: "+numberD)
}


fun main(args:Array<String>){
    show("Hosanna")
    show(10.5)
    show(100)
}