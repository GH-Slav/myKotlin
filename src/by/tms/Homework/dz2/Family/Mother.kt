package by.tms.Homework.dz2.Family

open class Mother(name: String, age: Int, sex: Human.SEX) : Woman(name, age, sex) {
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String) : this(name, age, sex) {
        this.birthplace = birthplace
    }
    constructor(name: String, age: Int, sex: Human.SEX, birthplace: String, hasMarry: Marry) : this(name, age, sex, birthplace) {
        this.hasMarry = hasMarry
    }

    var hasMarry: Marry? = null

    enum class Marry { Yes, No, YesNoYes}

    override fun say() {
        println("My name is $name \n " +
                "I am $age years old \n" +
                "My gender $sex \n" +
                "I was born $birthplace \n"+
                "I'm married - $hasMarry \n")
    }
}