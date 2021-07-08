
fun main() {


    operator fun Int.times(str: String) = str.repeat(this)
    println("Bye")
    println(2 * "Bye")


    operator fun String.get(range: IntRange) =substring(range)
    val str = "abcdefghijklnmnsdfasdf"
    println(str[0..5])
}
