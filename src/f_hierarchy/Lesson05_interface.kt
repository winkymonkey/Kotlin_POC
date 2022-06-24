package src.f_hierarchy

// ----------------------------------------------------------------------
// USAGE OF INTERFACE
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func5A()
}



// ----------------------------------------------------------------------
interface Human5A {
    val height: Double
    fun hello(myName:String): String
}

class Person5A(val name:String, val age:Int): Human5A {
    override val height = 5.8
    override fun hello(myName:String) = "Hi $myName, I am ${this.name}"
}

fun func5A() {
    val persA = Person5A("John", 25)                   // a Person variable holds a "Person object"
    println(persA.height)
    println(persA.hello("Tom"))
    println(persA.name)
    println(persA.age)

    val humanB:Human5A = Person5A("Harry", 30)          // a Human variable holds a "Person object"
    println(humanB.height)
    println(humanB.hello("Tom"))

    val humanC = Person5A("Chris", 50) as Human5A       // a Human variable holds a "Person object that is typeCasted to Human object"
    println(humanC.height)
    println(humanC.hello("Tom"))
}
