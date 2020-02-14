package by.tms.Homework.dz2.Family

open class Man(override val name: String, override val age: Int, override val sex: Human.SEX) : Human {

    var occupation: String? = null

    override fun say() {}

    override fun eat() {}

    override fun work() {}


}