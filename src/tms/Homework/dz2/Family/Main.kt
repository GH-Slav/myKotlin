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


    var catalogFamily = ArrayList<String>()
    catalogFamily.add("${myFather.name} ${myFather.age}")
    catalogFamily.add("${myMother.name} ${myMother.age}")
    catalogFamily.add("${myDaughter.name} ${myDaughter.age}")
    catalogFamily.add("${mySon.name} ${mySon.age}")

    catalogFamily.sortBy { myFather.age }

    println(catalogFamily)
}