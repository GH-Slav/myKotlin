package by.tms.Homework.dz2.Family

class Daughter(name: String, age: Int, sex: Human.SEX, birthplace: String, marry: Marry) :
    Mother(name, age, sex, birthplace, marry), Human{
    override fun say() =
        println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was born $birthplace \n  ${marry?.mar} \n")
}