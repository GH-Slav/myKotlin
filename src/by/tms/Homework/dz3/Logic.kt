package by.tms.Homework.dz3

import java.lang.StringBuilder


class Logic {

    fun countEvenAndOdd(a: Int, b: Int) {
        val c = if (a % 2 != null) a + b else a * b
        //или a = null так тоже получилось у меня
        println("c = $c")
    }

    fun countMax(a: Int, b: Int, c: Int) {
        val d = if ((a + b + c) < (a * b * c)) a * b * c else a + b + c
        println("Максимальное значение - $d")
    }

    fun rating(r: Int) {
        when (r) {
            in 0..19 -> println("Оценка студента - $r F")
            in 20..39 -> println("Оценка студента - $r E")
            in 40..59 -> println("Оценка студента - $r D")
            in 60..74 -> println("Оценка студента - $r C")
            in 75..89 -> println("Оценка студента - $r B")
            in 90..100 -> println("Оценка студента - $r A")
            else -> println("ООООй вы ошиблись ...")
        }
    }

    fun attachEnvelopes(a: Double, b: Double, c: Double, d: Double) {
        var env1 = a * b
        var env2 = c * d
        when {
            env1 < env2 -> println("Конверт 1 вложиться Конверт 2")
            env2 < env1 -> println("Конверт 2 вложиться Конверт 1")
            else -> println("Конверт 1 равен площади Конверту 2")
        }
    }

    fun sumEven() {

        // (1..99).filter { it /2 == 0 }
        // нашел в интернете
        var sum = 0
        for (k in 1..99) if (k % 2 == 0) {
            sum += k
        }
        println("Сумма четных чисел равна $sum")

    }

    fun factorial(n: Int): Int {
        var n2 = 1
        for (n in 1..n) {
            n2 *= n
        }
        println("Факториал числа $n равен $n2")
        return n2
    }

    var str = StringBuilder()
    fun binarySystem(n: Int) = with(str) {
        var i = n
        while (i > 0) {
            if (i % 2 == 0) {
                append("0")
            } else {
                append("1")

            }

            i /= 2
        }
        println(" Бинарный код $n равен $str ")

        toString()

    }


}