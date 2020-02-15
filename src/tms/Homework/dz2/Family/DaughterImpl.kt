package by.tms.Homework.dz2.Family

class DaughterImpl(name: String, age: Int, sex: Human.SEX, birthplace: String, marry: Mother.Marry) :
    MotherImpl(name, age, sex, birthplace, marry), Daughter {
    override fun say() =
        println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was born $birthplace \n  ${marry.mar} \n")
}