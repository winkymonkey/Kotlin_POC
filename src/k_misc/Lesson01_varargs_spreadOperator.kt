package src.k_misc

// ----------------------------------------------------------------------
// VARARG
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A("John", "Harry", "Maria")
    func1B("John", "Harry", "Maria", greeting = "Welcome")
    func1C("John", "Harry", "Maria")
}



// ----------------------------------------------------------------------
fun func1A(vararg names:String) {
    for (name in names)
        println(name)
}

fun func1B(vararg names:String, greeting:String) {
    for (name in names)
        println("$greeting $name")
}

fun func1C(vararg names:String) {
    func1A(*names)                                      // inside a function, vararg looks like an array. So we use "spread operator" to turn in back to vararg
    func1A(*listOf("a","b","c").toTypedArray())         // first convert List into an Array, then use "spread operator" to turn in back to vararg
    func1B(*names, greeting="Welcome")                  // if we have same typed parameter after vararg, then it has to be a NamedParameter
}
