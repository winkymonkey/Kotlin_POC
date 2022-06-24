package pack05_classAndObject

// ----------------------------------------------------------------------
// NAMED PARAMETER PASSING (NO WORRY OF SEQUENCE)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func6A()
}



// ----------------------------------------------------------------------
class Person6A(val name:String, val age:Int=40, val height:Double=5.10)

fun func6A() {
    // Usual parameter passing
    val p1 = Person6A("John")
    val p2 = Person6A("John", 30)
    val p3 = Person6A("John", 30, 40000.0)

    // Named-Parameter passing
    val p4 = Person6A("John", height=5.5)
    val p5 = Person6A("John", height=5.5, age=40)
    val p6 = Person6A(height=5.5, name="John", age=40)
}
