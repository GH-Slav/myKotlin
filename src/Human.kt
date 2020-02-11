class Human {
    var name: String? = null


    class Student {
        fun sayId(studentId: Int? = null) = "my id is $studentId"
    }

    inner class Teacher {
        var homeWorkId: Int? = null
        fun sayHello(){
            name = "Alex"
  // alex
            println("my name is $name")
        }

        fun giveHomeWork() :Int {
            return homeWorkId ?: 14
        }


    }
}