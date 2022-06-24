package pack05_classAndObject

// ----------------------------------------------------------------------
// SECONDARY CONSTRUCTOR
// (a class can also declare secondary constructors, which are prefixed with "constructor" keyword)
// ----------------------------------------------------------------------
class Person3A {
    constructor(name:String, age:Int) {
        //...
    }
}


// ----------------------------------------------------------------------
// PRIMARY and SECONDARY CONSTRUCTOR
// (if the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor)
// ----------------------------------------------------------------------
class Person3B(name:String) {
    constructor(name:String, age:Int) : this(name) {
        //...
    }
}


// ----------------------------------------------------------------------
// SECONDARY CONSTRUCTOR and INIT BLOCK
// - Code in init blocks effectively becomes part of the primary constructor.
// - Delegation to the primary constructor happens as the first statement of a secondary constructor, so init block is executed before executing the secondary constructor.
// - Even if the class has no primary constructor, the delegation still happens implicitly, and the init blocks are still executed.
// ----------------------------------------------------------------------
class Person3C {
    init {
        println("Init block")
    }
    constructor(i: Int) {
        println("Constructor $i")
    }
}


// ----------------------------------------------------------------------
// NO CONSTRUCTOR
// (if a class doesn't declare any constructors (primary/secondary), it will have a generated primary constructor with no arguments (visibility public))
// ----------------------------------------------------------------------
class Person3D {

}

// if we don't want your class to have a public constructor, we should declare an empty primary constructor with non-default visibility:
class Person3E private constructor() {
    //...
}
