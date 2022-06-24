package pack06_hierarchy

// ----------------------------------------------------------------------
// Code in a derived class can call its superclass functions and property accessor implementations using the super keyword.
// ----------------------------------------------------------------------
open class Parent3A {
    var color:String = "Red"
    open fun hello() {
        println("hello from parent")
    }
}

class Child3A:Parent3A() {
    override fun hello() {
        super.hello()
        println("hello from child")
    }
    fun printColor() {
        println("printing color=${super.color}")
    }
}
