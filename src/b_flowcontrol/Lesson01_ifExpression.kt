package src.b_flowcontrol

// ----------------------------------------------------------------------
// In Kotlin, if is an expression (it returns a value)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A()
    func1B(10, 12)
}



// ----------------------------------------------------------------------
// IF expression is assigned to a variable
// ----------------------------------------------------------------------
fun func1A() {
    val a = 5
    val b = 8

    val max = if (a > b) {
        println("Choose a")
        a                                       // returns "a"
    } else {
        println("Choose b")
        b                                       // returns "b"
    }
    println(max)
}


// ----------------------------------------------------------------------
// IF expression is assigned to a function
// ----------------------------------------------------------------------
fun func1B(a:Int, b:Int) = if (a > b) {
    println("Choose a")
    a                                       // returns "a"
} else {
    println("Choose b")
    b                                       // returns "b"
}
