package src.e_classobject

// ----------------------------------------------------------------------
// CALL FUNCTIONS OF A CLASS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func7A()
}



// ----------------------------------------------------------------------
class Person7A(var name:String, var age:Int?) {
    fun nextAge():Int {
        return (age ?: 0) + 1                               // TERNARY OPERATOR
    }
    fun isOlderThan(other:Person7A): Boolean {
        return (other.age ?: 0) < (age ?: 0)
    }
}

fun func7A() {
    val persA = Person7A("John", 30)
    println(persA.nextAge())

    val persB = Person7A("Tom", 3)
    println(persA.isOlderThan(persB))
}
