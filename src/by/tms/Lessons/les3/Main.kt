package by.tms.Lessons.les3

fun main() {
    val newCar = Car()
    newCar.showParams()
    newCar.carAddModelName("Tesla")
    newCar.carAddHorsePower(1000)

    println("${90.plusTen()}")
}


fun Car.carAddModelName(model: String) {
    this.getModel()
}

fun Car.carAddHorsePower(power: Int) {
    this.horsePower = power
}

fun Int.plusTen(): Int {
    return this + 10
}
