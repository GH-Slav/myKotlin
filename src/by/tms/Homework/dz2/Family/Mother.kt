package by.tms.Homework.dz2.Family

open class Mother(name: String, age: Int, sex: Human.SEX) : Woman(name, age, sex), Human {
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String) : this(name, age, sex) {
        this.birthplace = birthplace
    }
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String, marry: Marry) : this(name, age, sex, birthplace) {
        this.marry = marry
    }

    var marry: Marry? = null

    enum class Marry(var mar: String) { No("I'm not married"), Yes("I'm married") }

    override fun say() =
        println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was born $birthplace \n  ${marry?.mar} \n")

}