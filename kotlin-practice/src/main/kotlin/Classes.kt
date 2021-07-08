class Customer

class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1,"test1@gmail.com")


    println(contact.id)
    println(contact.email)
    println(contact)

    println("******`")
    contact.email = "test2@gmail.com"
    println(contact.email)
}