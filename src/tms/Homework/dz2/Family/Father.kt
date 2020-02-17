package by.tms.Homework.dz2.Family

open class Father(name: String, age: Int, sex: Human.SEX) : Man(name, age, sex), Human {
    constructor(name: String, age: Int, sex: Human.SEX, occupation: String) : this(name, age, sex) {
        this.occupation = occupation
    }
    constructor(name: String, age: Int, sex: Human.SEX, occupation: String, hasFamily: Boolean) : this(name, age, sex, occupation) {
        this.hasFamily = hasFamily
    }

    var hasFamily: Boolean? = null

    override fun say() =
        println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was engaged $occupation \n I'm married - $hasFamily \n")
}