package pack07_class_advanced

// ----------------------------------------------------------------------
// Object Expressions are used to create objects of ANONYMOUS (i.e. that aren't explicitly declared) LOCAL (i.e. for one-time use) classes
// We can define these classes from scratch OR inherit from existing classes OR implement interfaces.
// Instances of these classes are also called anonymous objects because they are defined by an expression, not a name.
// Object Expressions start with the OBJECT keyword.
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func7A()
    func7B()
    func7C()
    func7D()
}



// ----------------------------------------------------------------------
// Creating anonymous objects from SCRATCH
// ----------------------------------------------------------------------
class MyClass7A {
    val myObj = object {
        val firstName = "Tom"
        val lastName = "Cruise"
        override fun toString() = "$firstName --- $lastName --- ${myFunc()}"
        fun myFunc() = "hello world"
    }
}
fun func7A() {
    println(MyClass7A().myObj)
}



// ----------------------------------------------------------------------
// Creating anonymous objects from ONE SUPERTYPE
// ----------------------------------------------------------------------
open class Person7B(val name:String, val age:Int) {
    open fun greet() = "default greeting"
}

class MyClass7B {
    val myObj = object:Person7B("John", 30) {
        val country = "India"
        override fun greet() = "Welcome $name, $age from $country"
        override fun toString() = "$name --- $age -- $country"
    }
}

fun func7B() {
    println(MyClass7B().myObj)
    println(MyClass7B().myObj.name)
    println(MyClass7B().myObj.age)
    println(MyClass7B().myObj.greet())
}



// ----------------------------------------------------------------------
// Creating anonymous objects from MULTIPLE SUPERTYPES
// ----------------------------------------------------------------------
interface Human7C {
    val height:Double
}
open class Person7C(val name:String, val age:Int) {
    open fun greet() = "default greeting"
}

class MyClass7C {
    val myObj:Person7C = object:Person7C("John", 30), Human7C {            // As it has multiple supertypes, "x" must declare its type explicitly
        val country = "India"
        override val height = 5.8
        override fun greet() = "Welcome $name, $age from $country"
        override fun toString() = "$name --- $age --- $country --- $height"
    }
}

fun func7C() {
    println(MyClass7C().myObj)
    println(MyClass7C().myObj.name)
    println(MyClass7C().myObj.age)
    println(MyClass7C().myObj.greet())
}



// ----------------------------------------------------------------------
// Anonymous objects as RETURN TYPE
// ----------------------------------------------------------------------
class Person7D {
    private fun getObj() = object {
        val myObj: String = "abc"
    }
    fun print() {
        println(getObj().myObj)                   // the "myObj" is accessible ONLY IF "getObj()" is PRIVATE FUNCTION (i.e. local to the class)
    }
}

fun func7D() {
    Person7D().print()
}
