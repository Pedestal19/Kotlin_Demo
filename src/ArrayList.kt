/**
 * Author: Hosanna Gabe-Oji.
 *Project: Kotlin_Demo.
 *Date: 3/8/2020.
 */

fun main(args:Array<String>){

    var arraylist= ArrayList<String>()
    arraylist.add("Tommy")
    arraylist.add("Tom")
    arraylist.add("Doggy")
    arraylist.add("Ford")
    arraylist.add("one")

    println("First name: " +arraylist.get(0))
    arraylist.set(0, "Hozay")

    println("all element by object")
    for(item in arraylist){
        println(item)
    }

    println(" all element by index")
    for(index in 0..arraylist.size-1){
        println(arraylist.get(index))    
    }

    //Search
    if(arraylist.contains("Hozay")){
        print("name is found")
    }
    else{
        println("name is not found")
    }

}