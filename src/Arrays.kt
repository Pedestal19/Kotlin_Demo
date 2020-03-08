/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun main(args:Array<String>){

    var arrayInt=Array<Int>(5){0}
    arrayInt[3] = 55
    println("Array[3]="+ arrayInt[3])

    println("--All Element by object--")
    for(element in arrayInt){
        println(element)
    }
    println("--All Element by index--")
    for(index in 0..4){
        println("index: $index  value: " +arrayInt[index])
    }

    var arrayStr=Array<String>(4){""}
    for(index in 0..3){
        println("arrayStr[ "+index+ " ]=")
        arrayStr[index] = readLine()!!
    }

    for(index in 0..3){
        println("arrayStr[ "+index+ " ]=" +arrayStr[index])
    }
}