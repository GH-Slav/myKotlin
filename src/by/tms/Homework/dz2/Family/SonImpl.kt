package by.tms.Homework.dz2.Family

class SonImpl(name: String, age: Int, sex: Human.SEX, occupation: String, hasFamily: Boolean) :
    FatherImpl(name, age, sex, occupation, hasFamily), Son {

    override fun say() =
      println("My name is $name. \n I am $age years old. \n My gender $sex. \n I was engaged $occupation \n I'm married - $hasFamily \n")
}