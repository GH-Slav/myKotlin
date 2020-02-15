package by.tms.Homework.dz2.Family

interface Mother {
    var marry: Marry

    enum class Marry(var mar: String) { No("I'm not married"), Yes("I'm married") }
}