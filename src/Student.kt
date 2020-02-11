class Student {
    var name = "Egor"
    var age = 18.5F
    var weight = 70
    val ageOfStudy = 1
    var lastName: String? = null
    var height: Float? = null

    fun grow(): Float {
        return height ?: 180.1F
    }

    fun study() {
            println(lastName)
            println("I'm studying")
            height = 200F
    }

    fun read(time: Int) = "I'm reading for $time hours"
    fun eat(breakfastWeight: Double) = weight + 1
}    
