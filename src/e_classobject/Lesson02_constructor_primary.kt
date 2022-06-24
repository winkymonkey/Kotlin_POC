package src.e_classobject

// ----------------------------------------------------------------------
// CONSTRUCTOR
// (kotlin class can have "a primary constructor" and "one or more secondary constructors")
// ----------------------------------------------------------------------



// ----------------------------------------------------------------------
// PRIMARY CONSTRUCTOR
// (primary constructors cannot contain any code)
// (below two declarations are same)
// ----------------------------------------------------------------------
class Person2A constructor(name: String)
class Person2B(name: String)

class Person2C(val name:String, val age:Int, var salary:Int)        // multiple paramater in primary constructor



// ----------------------------------------------------------------------
// INIT BLOCK
// (initialization code can be placed in init blocks)
// (they execute in the order of their appearance)
// ----------------------------------------------------------------------
class Person2D(name: String) {
    val firstProp = "First property: $name"
    init {
        println("First init block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}"
    init {
        println("Second init block that prints ${name.length}")
    }
}