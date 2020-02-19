package by.tms.Lessons.les3

import kotlinx.coroutines.*

fun main() {
//    val newCar = Car()
//    newCar.showParams()
//    newCar.carAddModelName("Tesla")
//    newCar.carAddHorsePower(1000)
//
//    println("${90.plusTen()}")
//}
//
//
//fun Car.carAddModelName(model: String) {
//    this.getModel()
//}
//
//fun Car.carAddHorsePower(power: Int) {
//    this.horsePower = power
//}
//
//fun Int.plusTen(): Int {
//    return this + 10

//    val job = CoroutineScope(Dispatchers.Default).launch {
//        val startTime = System.currentTimeMillis()
//        val result1 = async { println(countTimesTen(9))}
//        val result2 = async { println(countTimesTen(8))}
//        val result3 = async { println(countTimesTen(7))}
//        println(result1.await())
//        println(result2.await())
//        println(result3.await())
//
//       val endTime = System.currentTimeMillis()
//
//
//
//        println("Этот код выполняеться ${endTime - startTime}  мс ")
////        withContext(Dispatchers.Main){
////        }
//    }
//
//    job.start()
//    Thread.sleep(4000)

//    runBlocking {
//        withTimeoutOrNull(500){
//            println(countTimesTen(9))
//        }?: println("Timeout")
//    }
////withContext(Dispatchers.Main){}
//
//
//}
//
//suspend fun countTimesTen(n: Int): Int {
//    delay(1000)
//    return n * 10

    //сингел тон
    val car = Car.instance
    car.model = "Lamba"
    car.horsePower = 1000
    val newCar = Car.a("Ferrari", 856555)

    newCar.showParams()

}