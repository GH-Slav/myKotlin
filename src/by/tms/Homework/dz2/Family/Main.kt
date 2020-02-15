package by.tms.Homework.dz2.Family

fun main() {
    val myFather = FatherImpl("Victor", 45, Human.SEX.MAN, "ROAD CAR", true)
    val myMother = MotherImpl("Anna", 41, Human.SEX.WOMAN, "Minsk", Mother.Marry.Yes)
    val myDaughter = DaughterImpl("Eva", 10, Human.SEX.WOMAN, "Tokyo", Mother.Marry.No)
    val mySon = SonImpl("Sasha", 9, Human.SEX.MAN, "CAR GAME", false)

    myFather.say()
    myMother.say()
    myDaughter.say()
    mySon.say()

    var catalogFamily = listOf(
        "${myFather.name}" to myFather.age,
        "${myMother.name}" to myMother.age,
        "${myDaughter.name}" to myDaughter.age,
        "${mySon.name}" to mySon.age
    )

    catalogFamily.sortedBy { it.second }

    println(catalogFamily)
}