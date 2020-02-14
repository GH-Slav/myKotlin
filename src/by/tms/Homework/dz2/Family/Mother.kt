package by.tms.Homework.dz2.Family

open class Mother(name: String, age: Int, sex: Human.SEX) : Woman(name, age, sex) {
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String) : this(name, age, sex)
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String, hasFather: String) : this(name, age, sex, birthplace)

    var hasFather: String? = null

    override fun say() {
        println("My name is $name \n " +
                "I am $age years old \n" +
                "My gender $sex \n" +
                "I was born $birthplace \n"+
                "I'm married - $hasFather")
    }
}