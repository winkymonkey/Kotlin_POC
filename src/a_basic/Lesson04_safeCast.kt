package src.a_basic

// ----------------------------------------------------------------------
// SAFE CAST (as?)
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func4A()
}



// ----------------------------------------------------------------------
fun func4A() {
    val obj:Any? = "Hello World"

    val b = obj as? String                    // "b" is of type "STRING?" aka NULLABLE STRING
    val c = obj as? String ?: return          // "c" is of type "STRING"

    println(b?.length)
    println(c.length)
}
