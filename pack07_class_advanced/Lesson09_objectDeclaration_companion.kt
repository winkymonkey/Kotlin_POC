package pack07_class_advanced

// ----------------------------------------------------------------------
// OBJECT DECLARATION inside a class can be marked with the companion keyword
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func9A()
}



// ----------------------------------------------------------------------
class Person9A {
    companion object Comp {
        var count:Int = 10
        @JvmStatic                                              // functions in COMPANION OBJECT should be annotated with @JvmStatic so that it can be called from outside java classes statically
        fun print() {
            println("printing count as $count")
        }
        @JvmStatic
        fun increment() {
            println("incrementing count as ${++count}")
        }
    }
    fun greet() {
        println("Hello World")
    }
}

fun func9A() {
    // functions inside COMPANION OBJECT can be accessed like below (by default)
    Person9A.Comp.count
    Person9A.Comp.print()
    Person9A.Comp.increment()

    // Below is more readable & convenient way to do so
    Person9A.count
    Person9A.print()
    Person9A.increment()
    Person9A().greet()
}
