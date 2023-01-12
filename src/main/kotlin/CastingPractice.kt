import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 1..10) {
        val service: NetworkService = getNetworkService()
        (service as? FTPService)?.transferFile()
    }

}

open class NetworkService {}
class FTPService: NetworkService() {
    fun transferFile() {
        println("the file is transferred")
    }
}

fun getNetworkService(): NetworkService {
    return if(Random.nextInt() % 2 == 0)
        NetworkService()
    else
        FTPService()
}