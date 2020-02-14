package by.tms.Homework.dz2.Family

class Daughter(name: String, age: Int, sex: Human.SEX, birthplace: String, hasFather:String) :
    Mother(name, age, sex, birthplace, hasFather) {
    override fun say() {

            println("My name is $name \n " +
                    "I am $age years old \n" +
                    "My gender $sex \n" +
                    "I was born $birthplace \n"+
                    "I'm married - $hasFather")

    }
}