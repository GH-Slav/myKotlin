package by.tms.Homework.dz2.Family

fun main() {
    val myFather = Father("Victor", 45, Human.SEX.MAN, "ROAD CAR", true)
    val myMother = Mother("Anna", 41, Human.SEX.WOMAN, "Minsk", Mother.Marry.YesNoYes)
    val myDaughter = Daughter("Eva", 10, Human.SEX.WOMAN, "TOKYO", Mother.Marry.No)
    val mySon = Son("Sasha", 9, Human.SEX.MAN, "CAR GAME", false)

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