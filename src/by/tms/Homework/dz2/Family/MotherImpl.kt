package by.tms.Homework.dz2.Family

open class MotherImpl(name: String, age: Int, sex: Human.SEX, override var marry: Mother.Marry) : Woman(name, age, sex), Mother {
    constructor(name: String, age: Int, sex: Human.SEX, marry: Mother.Marry, birthplace: String) : this(name, age, sex, marry) {
        this.birthplace = birthplace
    }
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String, marry: Mother.Marry) : this(name, age, sex, marry, birthplace)


    override fun say() =
        println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was born $birthplace \n  ${marry.mar} \n")

}