package src.f_hierarchy

// ----------------------------------------------------------------------
// USAGE OF INHERITANCE
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func7A()
}



// ----------------------------------------------------------------------
interface Human7A {
    val height:Double
    fun hello(myName:String): String
}

open class Person7A(val name:String, val age:Int) : Human7A {
    override val height = 5.8
    override fun hello(myName:String) = "Hi $myName, I am ${this.name} of age=$age and height=$height"
}

class Customer7A(val id:Int, name:String, age:Int): Person7A(name, age)



// ----------------------------------------------------------------------
fun func7A() {
    val custA = Customer7A(9, "John", 25)                   // a Customer variable holds a "Customer object"
    println(custA.height)
    println(custA.hello("Tom"))
    println(custA.id)
    println(custA.name)
    println(custA.age)

    val persB = Person7A("Harry", 30)                           // a Person variable holds a "Person object"
    println(persB.height)
    println(persB.hello("Tom"))
    println(persB.name)
    println(persB.age)

    val persC:Person7A = Customer7A(9, "Chris", 25)         // a Person variable holds a "Customer object"
    println(persC.height)
    println(persC.hello("Tom"))
    println(persC.name)
    println(persC.age)

    val persD = Customer7A(9, "Maria", 25) as Person7A      // a Person variable holds a "Customer object that is typeCasted to Person object"
    println(persD.height)
    println(persD.hello("Tom"))
    println(persD.name)
    println(persD.age)
}
