/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/7/2020.
 */

fun main(args:Array<String>){

    var title ="Welcome to Abuja"
    print(title)
    println("title:" +title)
    println("title: $title")

    var name="Hosanna " + "Gabe-Oji"
    println("name: $name")

    println("Second Char: "+title[5])
    println("title to uppercase: "+title.toUpperCase())
    println("title to lowercase: "+title.toLowerCase())
    println("title split:: "+title.split(" "))
    println("title: "+title.trim())


}