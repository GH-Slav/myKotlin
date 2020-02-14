package by.tms.Lessons.les2



open class Bird(var canFly: Boolean) : Animal {
    constructor(canFly: Boolean, name: String) : this(canFly)

    var numberOfFeathers: Int? = null
    override var numberOfLegs: Int = 0
        get() = field
        set(value: Int) {
            field = value + 2
        }

    override fun breath() {
        println("I can breath")
    }

    override fun eat() :String {
        return "eat"

    }

    override fun move() {
        println("I can fly and move on my $numberOfLegs legs")
    }

}