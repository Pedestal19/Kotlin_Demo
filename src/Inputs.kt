/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/3/2020.
 */



fun main(args:Array<String>){
    print("Enter name:")
    var name = readLine();
    print("Enter Age: ")
    var age:Int = readLine()!!.toInt()   //Add non null asserted call
    print("Enter department: ")
    var dept:String?
    dept = readLine()
    print("Enter pi: ")
    var pi:Double= readLine()!!.toDouble()

    println("**** output *****")
    println("name: "+name)
    println("age: "+age)
    println("department: "+dept)
    println("PI: "+pi)



}