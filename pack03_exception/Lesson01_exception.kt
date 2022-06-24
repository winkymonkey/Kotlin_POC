package pack03_exception

// ----------------------------------------------------------------------
// EXCEPTION
// - All exception classes in Kotlin inherit the Throwable class.
// - Every exception has a message, a stack trace, and an optional cause.
// - To throw an exception object, use the throw expression.
// - To catch an exception, use the try... catch expression.
// - try is an expression, which means it can have a return value.
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A()
    func1B()
}



// ----------------------------------------------------------------------
// TRY EXPRESSION
// - The returned value of a TRY EXPRESSION is either the last expression in the TRY block or the last expression in the CATCH block(s).
// - The contents of the FINALLY block don't affect the result of the expression.
// ----------------------------------------------------------------------
fun func1A() {
    val input = 50.7
    val output: Int? = try {
        println("inside try")
        input.toInt()
    } catch (e: NumberFormatException) {
        println("inside catch")
        null
    }
}


// ----------------------------------------------------------------------
// THROW EXPRESSION
// (so it can be used as part of an Elvis expression)
// ----------------------------------------------------------------------
fun func1B() {
    val name = "John"
    val str = name ?: throw IllegalArgumentException("Name required")
}
