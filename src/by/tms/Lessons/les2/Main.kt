package by.tms.Lessons.les2

import java.util.ArrayList

fun main() {
/*
    val eagle = Bird(true)
    println(eagle.numberOfLegs)
    eagle.numberOfLegs = 2
    eagle.move()
    eagle.breath()

    val owl = Bird(true, "Sova")
    */

    /* run { println("Hello lambda")}
      val study = {name : String, hour: Int -> println("$name study as I can for $hour")}
      study("Artem", 2)

     */

    val numbers = ArrayList<Int>()
    numbers.add(3)
    numbers.add(6)
    numbers.add(56)
    numbers.add(33)
    val mappedNumbers = numbers.map {
        it * 2
    }
    numbers.sortBy {
        it
    }
    println(numbers)
    println(mappedNumbers)

}