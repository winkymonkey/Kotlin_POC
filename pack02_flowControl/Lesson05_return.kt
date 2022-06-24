package pack02_flowControl

// ----------------------------------------------------------------------
// RETURN and RETURN TO LABELS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func5A()
    func5B()
    func5C()
}



// ----------------------------------------------------------------------
// GLOBAL RETURNS
// ----------------------------------------------------------------------
fun func5A() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return                         // non-local return directly to the caller of the function
        print(it)
    }
    println("this point is unreachable")
}


// ----------------------------------------------------------------------
// LOCAL RETURNS
// ----------------------------------------------------------------------
fun func5B() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit                     // local return to the caller of the forEach loop
        print(it)
    }
    print(" done with explicit label")
}


// ----------------------------------------------------------------------
// LOCAL RETURNS WITH IMPLICIT LABELS
// ----------------------------------------------------------------------
fun func5C() {
    listOf(1, 2, 3, 4, 5).forEach {
    if (it == 3) return@forEach                     // local return to the caller of the forEach loop
        print(it)
    }
    print(" done with implicit label")
}
