
class Human {
    var name: String? = null


    class Student {
        fun sayId(studentId: Int? = null) = println("My id is $studentId")
    }

    inner class Teacher {

        fun sayHello() {
            println("My name is ${name ?: "ALex"}")
        }


        fun giveHomeWork(homeWorkId: String? = null) {
            println("Homework id is $homeWorkId")
        }

    }


}