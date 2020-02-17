package by.tms.Homework.dz2.Family

interface Human {
    val name: String
    val age: Int
    val sex: SEX

    enum class SEX { MAN, WOMAN }

    fun say()
    fun eat()
    fun work()

}