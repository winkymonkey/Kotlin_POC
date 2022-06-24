package pack05_classAndObject

// ----------------------------------------------------------------------
// ALL THE BELOW FUNCTIONS ARE SAME, JUST DIFFERENT DECLARATIONS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func8A()
}



// ----------------------------------------------------------------------
class Person8 {
    fun func1(): String {
        return "hello kotlin"
    }

    fun func2():String = "hello kotlin"

    fun func3() = "hello kotlin"
}

fun func8A() {
    println(Person8().func1())
    println(Person8().func2())
    println(Person8().func3())
}
