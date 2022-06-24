package pack09_collections

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func8A()
    func8B()
}



// ----------------------------------------------------------------------
// GROUP BY
// (if we want to group elements based on some condition)
// ----------------------------------------------------------------------
fun func8A() {
    val numbers = listOf("one", "two", "three", "four", "five")

    println(numbers.groupBy { it.first().uppercase() })                         // {O=[one], T=[two, three], F=[four, five]}
    println(numbers.groupBy({ it.first().uppercase() }, { it.uppercase() }))    // {O=[ONE], T=[TWO, THREE], F=[FOUR, FIVE]}        // keySelector & valueTransformer
}



// ----------------------------------------------------------------------
// GROUPING BY
// (if we want to group elements and then apply an operation to all groups at one time)
// ----------------------------------------------------------------------
fun func8B() {
    val numbers = listOf("one", "two", "three", "four", "five", "six")
    println(numbers.groupingBy { it.first() }.eachCount())                      // {o=1, t=2, f=2, s=1}
}
