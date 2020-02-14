package by.tms.Homework.dz2.Family

open class Woman(override val name: String, override val age: Int, override val sex: Human.SEX) : Human {

    var birthplace: String? = null

    override fun say() {}

    override fun eat() {}

    override fun work() {}

}