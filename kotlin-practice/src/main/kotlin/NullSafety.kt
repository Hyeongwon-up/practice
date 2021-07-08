
fun main() {

    var neverNull: String = "this can't be null"

//    neverNull = null

    var nullable: String? = " this can be null"
    nullable = null

    var inferredNonNUll = " compiler assumes non - null"
//    inferredNonNUll = null

    fun strLength(notNull: String): Int {
        return notNull.length
    }


    println(strLength(neverNull))
//    strLength(nullable)



}