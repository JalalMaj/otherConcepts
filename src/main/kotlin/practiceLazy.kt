import kotlin.random.Random

fun main(args: Array<String>) {
    val generateList: ArrayList<Int> by lazy {
        generateList()
    }

    val input = readln()!!
    if(input == "yes") {
        println(generateList)
    }
}

fun generateList(): ArrayList<Int> {
    var list = arrayListOf<Int>()
    for(i in 0..1000) {
        var number = Random.nextInt(10000)
        list.add(number)
    }

    return list
}