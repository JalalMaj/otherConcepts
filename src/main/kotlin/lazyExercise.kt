/**
 * An object of a class NewUser is created for each new user. It contains a function to print a welcome message.

In your program, you have a list of banned usernames.

Ask the user to input their desired username. If it is not part of the list,
create the NewUser object and print the welcome message.


 */

fun main(args: Array<String>) {
    val newUser: NewUser by lazy { NewUser() }
    val banned = listOf("Alice", "Ali", "Bob", "Jack")

    println("Please enter a user name")
    val input = readln()!!
    if(!banned.contains(input)) {
        newUser.printUser(input)
    }
}

class NewUser {
    fun printUser(name: String){
        println("welcome $name !")
    }
}
