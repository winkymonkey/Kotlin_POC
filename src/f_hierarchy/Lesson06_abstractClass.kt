package src.f_hierarchy

// ----------------------------------------------------------------------
// USAGE OF ABSTRACT CLASS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func6A()
}



// ----------------------------------------------------------------------
interface Human6A {
    fun hello(myName:String): String
}

abstract class Person6A(val name:String, val age:Int) : Human6A {
    abstract val height:Double
    override fun hello(myName:String) = "Hi $myName, I am ${this.name} of age=$age and height=$height"
    abstract fun goodBye():String
}

class Customer6A(val id:Int, name:String, age:Int, override val height:Double): Person6A(name, age) {          // we can change "val" to "var"
    override fun goodBye():String {
        return "Bye!"
    }
}



// ----------------------------------------------------------------------
fun func6A() {
    val custA = Customer6A(9, "John", 25, 5.8)               // a Customer variable holds a "Customer object"
    println(custA.hello("Tom"))
    println(custA.id)
    println(custA.name)
    println(custA.height)

    val persC: Person6A = Customer6A(9, "John", 25, 5.8)      // a Person variable holds a "Customer object"
    println(persC.hello("Tom"))
    println(persC.name)
    println(persC.height)

    val persD = Customer6A(9, "John", 25, 5.8) as Person6A    // a Person variable holds a "Customer object that is typeCasted to Person object"
    println(persD.hello("Tom"))
    println(persD.name)
    println(persD.height)
}
