package src.c_exception

// ----------------------------------------------------------------------
// NOTHING TYPE
// - This type has no values and is used to mark code locations that can never be reached.
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func2A()
    func2B()
}



// ----------------------------------------------------------------------
// THROW is of type NOTHING
// ----------------------------------------------------------------------
fun func2A() {
    val name = "John"
    val str = name ?: fail("Name required")
    println(str)                                    // 'str' is known to be initialized at this point
}
fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}


// ----------------------------------------------------------------------
// NULL is of "NOTHING?" type
// ----------------------------------------------------------------------
fun func2B() {
    val x = null           // 'x' has type `Nothing?`
    val myList = listOf(null)   // 'l' has type `List<Nothing?>
}
