/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun main(args:Array<String>){

    var map = HashMap<Int, String>()
    map.put(1, "Hosanna")
    map.put(2, "Gabe")
    map.put(3, "Moninseh")

    println(map.get(2))

    map.put(2, "Gabe-OJi")

    for(k in map.keys){
        println(map.get(k))
    }
}