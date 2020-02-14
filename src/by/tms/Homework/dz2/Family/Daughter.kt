package by.tms.Homework.dz2.Family

class Daughter(name: String, age: Int, sex: Human.SEX, birthplace: String, hasNameFather: Father) :
    Mother(name, age, sex, birthplace, hasNameFather) {
    override fun say() {

            println("My name is $name \n " +
                    "I am $age years old \n" +
                    "My gender $sex \n" +
                    "I was born $birthplace \n"+
                    "I'm married - $hasNameFather")

    }
}