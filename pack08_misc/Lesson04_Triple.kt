package pack08_misc

// ----------------------------------------------------------------------
// TRIPLE
// (represents a triad of values)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func4A()
}



// ----------------------------------------------------------------------
fun func4A() {
    val myTriple = Triple("John", 30, 10000)
    println(myTriple.first)                                                 // John
    println(myTriple.second)                                                // 30
    println(myTriple.third)                                                 // 10000
    println(myTriple.toList())                                              // [John, 30, 10000]
    println(myTriple.toString())                                            // (John, 30, 10000)

    val(name, age, salary) = Triple("John", 30, 10000)    // automatic destructuring
    println("$name --- $age --- $salary")
}
