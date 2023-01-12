import kotlin.random.Random

fun main(args: Array<String>) {
    val largeNumberValue: String by lazy {
        "This a large value"
    }

    val rand = Random.nextInt()
    if(rand % 2 == 0) println(largeNumberValue)

    val integer: Int by lazy {
     if(rand %2 ==0 ) return@lazy 0 else return@lazy rand
    }
    println(integer)
}