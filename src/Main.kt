fun main() {
    /*   val student = Student()
   student.study()
   println(student.read(2))
       println(student.grow())
       val myGroup = Group()
       myGroup.id
       val mySubGroup = Group.SubGroup()
       mySubGroup.write()
       val myInnerGroup = Group().InnerGroup()
       myInnerGroup.talk()
     */

    // Dz
    val myStudent = Human.Student()
   println (myStudent.sayId())
    val myTeacher = Human().Teacher()
    myTeacher.sayHello()
    print("Homework id is ")
    println (myTeacher.giveHomeWork())
}