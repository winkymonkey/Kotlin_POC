package pack06_hierarchy

// ----------------------------------------------------------------------
// AUTOMATICALLY INHERITED FUNCTION
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func4A()
    func4B()
}



// ----------------------------------------------------------------------
// EQUALS(), HASHCODE, TOSTRING() ARE INHERITED BY DEFAULT
// ----------------------------------------------------------------------
class Person4A(val name:String, val age:Int)

fun func4A() {
    val p1 = Person4A("John", 30)
    val p2 = Person4A("John", 30)
    println(p1)                                 // toString() is inherited by default
    println(p2)                                 // toString() is inherited by default
    println(p1 == p2)                           // equals() is inherited by default
}



// ----------------------------------------------------------------------
// OVERRIDE INHERITED FUNCTIONS
// ----------------------------------------------------------------------
class Person4B(val name:String, val age:Int) {
    override fun toString(): String {                       // override toString() function
        return "$name -- $age"
    }
    override fun equals(other: Any?): Boolean {             // override equals() function
        return (other is Person4B && other.name == name)
    }
}

fun func4B() {
    val p1 = Person4B("Tom", 50)
    val p2 = Person4B("Tom", 60)
    val p3 = Person4B("Tommy", 70)

    println(p1.toString())
    println(p2.toString())
    println(p3.toString())

    println(p1 == p2)
    println(p1 == p3)
}
