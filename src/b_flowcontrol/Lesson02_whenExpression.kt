package src.b_flowcontrol

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func2A()
    func2B(10)
    func2C()
    func2D()
}



// ----------------------------------------------------------------------
// WHEN expression is assigned to a variable
// ----------------------------------------------------------------------
fun func2A() {
    val num:Any = 15
    val result = when(num) {
        5 -> "Red"
        10,20,30 -> "Green"
        in 40..50 -> "Blue"
        !in 40..50 -> "Violet"
        is String -> "It is a string"
        !is String -> "Not a string"
        else -> {
            println("--")
            "Yellow"
        }
    }
}


// ----------------------------------------------------------------------
// WHEN expression is assigned to a function
// ----------------------------------------------------------------------
fun func2B(num:Any):String = when(num) {
    5 -> "Red"
    10,20,30 -> "Green"
    in 40..50 -> "Blue"
    !in 40..50 -> "Violet"
    is String -> "It is a string"
    !is String -> "Not a string"
    else -> {
        println("--")
        "Yellow"
    }
}


// ----------------------------------------------------------------------
// WHEN expression (dynamic subject)
// ----------------------------------------------------------------------
fun func2C() {
    val x = 5
    val y = 8

    val state = when(val response = getNumber()) {
        5 -> "Red"
        10,20,30 -> "Green"
        in 40..50 -> "Blue"
        !in 40..50 -> "Violet"
        else -> {
            println("--")
            "Yellow"
        }
    }
}

fun getNumber():Int {
    return 100
}


// ----------------------------------------------------------------------
// WHEN expression (without subject)
// ----------------------------------------------------------------------
fun func2D() {
    val x = 5
    val y = 8

    val state = when {
        x.rem(2)==0 -> "even"
        y.rem(2)!=0 -> "odd"
        else -> "invalid"
    }
}
