import kotlin.random.Random

/**
 * The classes Cat and Dog inherit from an abstract class Animal. The Cat class has a function purr() and the Dog class has a function bark()

A function provides a list of animals, that are randomly distributed.

Design a program that invokes each respective function of each type of Animal from the list.
 */

fun main(args: Array<String>) {
    val animals:ArrayList<Animal> = getAnimals()
    var d = 0
    var c = 0
    animals.forEach {
        if(it.toString().contains("Cat")) c++ else d++
    }
    animals.forEach { animal ->
        (animal as? Dog)?.bark()
        (animal as? Cat)?.purr()
    }

    println("Total number of cats is $c")
    println("Total number of dogs is $d")
}

abstract class Animal {}
class Cat: Animal() {
    fun purr() {
        println("Cat is purring")
    }
}

class Dog: Animal() {
    fun bark() {
        println("Dog is barking")
    }
}

fun getAnimals(): ArrayList<Animal> {
    var animals: ArrayList<Animal> = arrayListOf<Animal>()
    for(i in 1..20){
        animals.add(
            if(Random.nextInt() % 2 == 0)
                Dog()
            else
                Cat()
        )
    }
    return animals
}