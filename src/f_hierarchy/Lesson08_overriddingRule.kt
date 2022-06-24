package src.f_hierarchy

// ----------------------------------------------------------------------
// OVERRIDING RULE
// - if a class inherits multiple implementations of the same member from its immediate superclasses, it must override this member and provide its own implementation
// - To denote the supertype from which the inherited implementation is taken, use "super<Parent>"
// ----------------------------------------------------------------------
open class Parent8A {
    open fun hello() {
        println("hello from parent")
    }
}

