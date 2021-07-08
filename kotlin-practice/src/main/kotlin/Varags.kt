
fun main() {

    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }

    printAll("gdgdgd", "asd", "test2")

    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for ( m in messages) println(prefix + m)
    }

    printAllWithPrefix("hello","hallo", prefix = "")

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    printAll("test")
    log("test")

}
