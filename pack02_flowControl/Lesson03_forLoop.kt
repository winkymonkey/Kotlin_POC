package pack02_flowControl

// ----------------------------------------------------------------------
// FOR LOOPS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func3A()
    func3B()
    func3C()
    func3D()
}



// ----------------------------------------------------------------------
fun func3A() {
    val nums = listOf(1, 2, 3)
    for (n in nums) {
        println(n)                      // prints each number
    }
}

fun func3B() {
    val nums = listOf(1, 2, 3)
    for (i in nums.indices) {
        println(i)                      // prints each index
    }
}

fun func3C() {
    val nums = listOf(1, 2, 3)
    for ((index, value) in nums.withIndex()) {                  // using the "withIndex" library function:
        println("the element at $index is $value")
    }
}

fun func3D() {
    for (n in 10..15) {
        println(n)
    }
}
