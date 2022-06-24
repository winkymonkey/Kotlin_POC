package pack08_misc

// ----------------------------------------------------------------------
// STRUCTURAL EQUALITY (==) ---------> consults the equals() function
// REFERENTIAL EQUALITY (===) -------> checks if two references point to the same object
// NEGATE STRUCTURAL EQUALITY (!=)
// NEGATE REFERENTIAL EQUALITY (!==)
// Comparison to NULL is automatically optimized to ===
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func2A()
}



// ----------------------------------------------------------------------
data class Point(val x:Int, val y:Int)

fun func2A() {
    val p1 = Point(1,2)
    val p2 = Point(1,2)
    println(p1 == p2)                   // true
    println(p1 === p2)                  // false

    val p3:Point? = null
    println(p3 == null)                 // true
}
