/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun main(args:Array<String>){

    var map= hashMapOf(1 to "Hosanna", 2 to "Gabe-Oji")
    map.put(3, "Tommy")
    println(map.get(3))
    println(map[3])

    var ar = arrayOf(1,10,22,11)
    println(ar[0])

    var list = listOf(11, 22, 33, 22)
//    list[0]=22 list immutable, cannot change value
   

    for(item in list){
        println(item)
    }

}