
open class Dog {
    open fun sayHello() {
        println("wow wow")
    }
}

class Yorkshire: Dog() {
    override fun sayHello() {
       println("wif wif")
    }
}

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says : grhh")
    }
}

class SiberianTiger: Tiger("siberia")

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()


    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

}