/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/3/2020.
 */


// This is main function
fun main(args:Array<String>){
    //Enter Username
    print("Enter name:")
    var name = readLine();
    print("Enter Age: ")
    var age:Int = readLine()!!.toInt()   //Add non null asserted call
    print("Enter department: ")
    var dept:String?
    dept = readLine()
    print("Enter pi: ")
    var pi:Double= readLine()!!.toDouble()

    /*Print output
        to allow users to see the variable values
     */

    println("**** output *****")
    println("name: "+name)
    println("age: "+age)
    println("department: "+dept)
    println("PI: "+pi)



}