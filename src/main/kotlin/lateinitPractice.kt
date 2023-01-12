fun main(args: Array<String>) {
    val myCountry = Country().apply { setName("Palestine") }
    println("My country is ${myCountry.getName()}")
}

class Country {
    private lateinit var name: String

    fun setName(name: String) {
        this.name = name
    }

    fun getName() = name
}