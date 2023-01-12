fun main(args: Array<String>) {
    val name = "Jalal"
    if(name is String) {
        println(name.length)
    }

    val myCar = getCar()
//    if(myCar !is BMW) {
//        println("This is not my favourite")
//    } else {
//        println("This is my favorite")
//    }

//    if(myCar is BMW) {
//        (myCar as BMW).drive()
//    }

    val bmwCar: BMW? = myCar as? BMW
    bmwCar?.drive()
}


open class Car {}
class BMW: Car() {
    fun drive(){
        println("Driving BMW")
    }
}
fun getCar(): Car = BMW()