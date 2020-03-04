/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/4/2020.
 */
fun main(args:Array<String>){

    var number1:Int = 10
    var number2:Int?
    var number2Str:String = "12"
    number2=number2Str.toInt()
    var number2Float:Float?
    number2Float=number2Str.toFloat()
    println("number1: "+ number1)
    println("number2: "+ number2)


    var xpi:Double=3.14
    println("xpi: " + xpi)
    var IntPi:Int=xpi.toInt()
    println("IntPi: "+ IntPi)

}