package by.tms.Homework.dz2.Family

class Son(name: String, age: Int, sex: Human.SEX, occupation: String, hasFamily: Boolean) :
    Father(name, age, sex, occupation, hasFamily) {

    override fun say() {
        println("My name is $name \n " +
                "I am $age years old \n" +
                "My gender $sex \n" +
                "I was engaged $occupation \n" +
                "I'm married - $hasFamily")

    }

}