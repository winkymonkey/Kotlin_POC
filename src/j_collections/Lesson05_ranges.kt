package src.j_collections

// ----------------------------------------------------------------------
// RANGES
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func5A()
    func5B()
    func5C()
    func5D()
    func5E()
}



// ----------------------------------------------------------------------
// Iteration
// ----------------------------------------------------------------------
fun func5A() {
    for (x in 1..5)             // forward iteration
        print(x)                // 1, 2, 3, 4, 5
    for (x in 5 downTo 1)       // reverse iteration
        print(x)                // 5, 4, 3, 2, 1
}

// ----------------------------------------------------------------------
// Range with custom steps
// ----------------------------------------------------------------------
fun func5B() {
    for (x in 1..8 step 2)
        print(x)                // 1, 3, 5, 7
}

// ----------------------------------------------------------------------
// Range excluding last element
// ----------------------------------------------------------------------
fun func5C() {
    for (x in 1 until 5) {      // x in [1,5) ---- 5 is excluded
        print(x)                // 1, 2, 3, 4
    }
}

// ----------------------------------------------------------------------
// Range - first, last, step
// ----------------------------------------------------------------------
fun func5D() {
    println((1..8).first)
    println((1..8).last)
    println((1..8).step)
    println((1..8 step 2).step)
}

// ----------------------------------------------------------------------
// RANGE OF CUSTOM OBJECTS
// - It’s also possible to create a range over custom objects. For that, the only requirement is to extend the Comparable interface.
// ----------------------------------------------------------------------
class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major)
            return this.major - other.major
        return this.minor - other.minor
    }
}
fun func5E() {
    val versionRange = Version(1,11)..Version(1,30)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
}
