fun main(args: Array<String>) {
    lateinit var networkService: String
    networkService = NetworkService2()
    println(networkService)
}

fun NetworkService2() = "Network service"