package pack01_basic

// ----------------------------------------------------------------------
// TYPE CHECK (is, !is)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func3A()
    func3B()
}


// ----------------------------------------------------------------------
fun func3A() {
    val obj:Any? = "Hello World"                // "obj" is of type "Any?" aka NULLABLE ANY
    if (obj is String) {                        // if "obj" is String
        println(obj.length)                     // at this line, compiler knows, it's a string, so we can access string attributes (SMART CAST)
    }

    if (obj !is String) {                       // SAME AS ---> !(obj is String)
        println("Not a String")
    } else {
        println(obj.length)
    }
}


// ----------------------------------------------------------------------
fun func3B() {
    val obj:Any? = "Hello World"
    when (obj) {
        is Int -> println(obj+1)
        is String -> println(obj.length + 1)
        is IntArray -> println(obj.sum())
    }
}
