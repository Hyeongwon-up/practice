

fun printMessage(message: String): Unit {
    print(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int , y: Int) :Int{
    return x+y
}

fun multiply(x: Int, y: Int): Int = x * y


fun main() {
    println("hello world")
    printMessage("hello")
    println()
    printMessageWithPrefix("Hello", "log")
    println(sum(3,4))
    println(multiply(3,4))
}