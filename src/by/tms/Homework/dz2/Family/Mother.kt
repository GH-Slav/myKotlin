package by.tms.Homework.dz2.Family

import by.tms.Homework.dz2.Family.Father

open class Mother(name: String, age: Int, sex: Human.SEX) : Woman(name, age, sex) {
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String) : this(name, age, sex)
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String, hasNameFather: Father) : this(name, age, sex, birthplace)

    var hasNameFather: Boolean? = null

    override fun say() {
        println("My name is $name \n " +
                "I am $age years old \n" +
                "My gender $sex \n" +
                "I was born $birthplace \n"+
                "I'm married - $hasNameFather")
    }
}