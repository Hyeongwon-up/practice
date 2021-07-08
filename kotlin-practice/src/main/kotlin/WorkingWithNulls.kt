fun main() {

    fun describeString(maybeString: String?): String {

        if(maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"

        }else {
            return "this is null"
        }
    }


    println(describeString(" "))
}