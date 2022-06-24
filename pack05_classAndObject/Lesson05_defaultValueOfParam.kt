package pack05_classAndObject

// ----------------------------------------------------------------------
// DEFAULT VALUE OF PARAMETER
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func5A()
}



// ----------------------------------------------------------------------
class Person5A(val name:String, val age:Int=40)

fun func5A() {
    val p1 = Person5A("John")
    val p2 = Person5A("John", 30)
}
