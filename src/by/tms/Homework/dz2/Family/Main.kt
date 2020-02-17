package by.tms.Homework.dz2.Family


fun main() {
    val myFather = Father("Victor", 45, Human.SEX.MAN, "ROAD CAR", true)
    val myMother = Mother("Anna", 41, Human.SEX.WOMAN, "Minsk", Mother.Marry.Yes)
    val myDaughter = Daughter("Eva", 10, Human.SEX.WOMAN, "Tokyo", Mother.Marry.No)
    val mySon = Son("Sasha", 9, Human.SEX.MAN, "CAR GAME", false)

    myFather.say()
    myMother.say()
    myDaughter.say()
    mySon.say()


    var catalogFamily = ArrayList<Human>()
    catalogFamily.add(myFather)
    catalogFamily.add(myMother)
    catalogFamily.add(myDaughter)
    catalogFamily.add(mySon)

    val catalogNameAge = catalogFamily.map { it -> it.name +" "+ it.age }

    catalogNameAge.sortedBy { myFather.age }

    println(catalogNameAge)

}