package by.tms.Lessons.les3

class Car {
    private var model: String? = null
    var horsePower: Int? = null

    fun showParams() {
        println("This is $model with $horsePower HP")
    }

    fun setModel(): String? {
        return model ?: "no model"
    }

    fun getModel() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun changeModel() {
        val a = model ?: return
    }

    companion object{
     fun a(model:String, power:Int): Car {
        fun a() = { println()}
        val instance = Car()
         instance.model = model
         instance.horsePower = power
         return instance

    }
}



