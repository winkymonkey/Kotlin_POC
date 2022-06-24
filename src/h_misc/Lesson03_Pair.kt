package src.h_misc

// ----------------------------------------------------------------------
// PAIR
// (represents a generic pair of two values)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func3A()
}



// ----------------------------------------------------------------------
fun func3A() {
    val myPair = Pair("John", 20)                       // SAME AS ---> val myPair = "Harry" to 34
    println(myPair.first)                   // John
    println(myPair.second)                  // 20
    println(myPair.toList())                // [John, 20]
    println(myPair.toString())              // (John, 20)

    val (name, age) = Pair("John", 20)                  // automatic destructuring
    println("$name --- $age")
}
