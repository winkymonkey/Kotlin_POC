package pack06_hierarchy

// ----------------------------------------------------------------------
// DEFAULT SUPER TYPE
// (all classes in Kotlin have a common superclass "Any")
// ----------------------------------------------------------------------
class Person1A {
    // Implicitly inherits from "Any"
    // "Any" has three methods: equals(), hashCode(), and toString(). Thus, these methods are available in all Kotlin classes.
}



// ----------------------------------------------------------------------
// OPEN KEYWORD
// (by default, Kotlin classes are final – they can’t be inherited. To make a class inheritable, mark it with the open keyword)
// ----------------------------------------------------------------------
open class Person1B {
    //...
}



// ----------------------------------------------------------------------
// EXPLICIT SUPER TYPE
// ----------------------------------------------------------------------
open class Parent1C(val age:Int) {
    //...
}
class Child1C(val name:String, age:Int):Parent1C(age) {
    // If the child class has a primary constructor, the parent class must be initialized in that primary constructor according to its parameters
}

class Child1D:Parent1C {
    // If the child class has no primary constructor, then each secondary constructor has to initialize the parent type using the super keyword
    constructor(name:String, age:Int):super(age) {
        //...
    }
}
