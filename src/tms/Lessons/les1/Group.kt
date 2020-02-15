package by.tms.Lessons.les1

class Group {
    val id = 900
    class  SubGroup {
        fun write() {
            println("I am writing")
        }
    }

    inner class InnerGroup {
        fun talk() {
            println("I am talking, my group id is $id")
        }
    }
}