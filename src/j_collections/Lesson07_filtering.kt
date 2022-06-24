package src.j_collections

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func7A()
    func7B()
    func7C()
    func7D()
}



// ----------------------------------------------------------------------
// FILTER
// ----------------------------------------------------------------------
fun func7A() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)                                                                        // [three, four]

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersMap.filter { (key,value) -> key.endsWith("1") && value > 10}
    println(filteredMap)                                                                        // {key11=11}
}



// ----------------------------------------------------------------------
// FILTER NOT
// ----------------------------------------------------------------------
fun func7B() {
    val numbers = listOf("one", "two", "three", "four")
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredNot)                                                                        // [three, four]
}



// ----------------------------------------------------------------------
// FILTER INDEXED
// ----------------------------------------------------------------------
fun func7C() {
    val numbers = listOf("one", "two", "three", "four")
    val filteredIdx = numbers.filterIndexed { index,str -> (index!=0) && (str.length<5) }
    println(filteredIdx)                                                                        // [two, four]
}



// ----------------------------------------------------------------------
// FILTER NOT NULL
// ----------------------------------------------------------------------
fun func7D() {
    val numbers = listOf(null, "one", "two", null)
    numbers.filterNotNull().forEach { println(it.length) }      // 3, 3
}



// ----------------------------------------------------------------------
// PARTITION
// ----------------------------------------------------------------------
fun func7E() {
    val numbers = listOf("one", "two", "three", "four")
    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)                                              // [three, four]
    println(rest)                                               // [one, two]
}



// ----------------------------------------------------------------------
// MISCELLANEOUS
// ----------------------------------------------------------------------
fun func7F() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.any { it.endsWith("e") })           // true
    println(numbers.none { it.endsWith("a") })          // true
    println(numbers.all { it.endsWith("e") })           // false
}



