package src.j_collections

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func6A()
    func6B()
    func6C()
    func6D()
    func6E()
    func6F()
    func6G()
}



// ----------------------------------------------------------------------
// MAPPING
// (create a collection from the results of a function on the elements of another collection)
// ----------------------------------------------------------------------
fun func6A() {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })                                                         // 3, 6, 9
    println(numbers.mapIndexed { idx,value -> idx*value })                                  // 0, 2, 6
    println(numbers.mapNotNull { if ( it==2) null else it*3 })                              // 3, 9         // exclude null while mapping
    println(numbers.mapIndexedNotNull { idx,value -> if (idx==0) null else idx*value })     // 2, 6         // exclude null while mapping

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.uppercase() })                                      // {KEY1=1, KEY2=2, KEY3=3, KEY11=11}   // mapping of keys
    println(numbersMap.mapValues { it.value + it.key.length })                              // {key1=5, key2=6, key3=7, key11=16}   // mapping of values
}


// ----------------------------------------------------------------------
// ZIPPING
// (build pairs from elements with the same positions in both collections)
// ----------------------------------------------------------------------
fun func6B() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf", "cow")
    println(colors.zip(animals))                                    // [(red, fox), (brown, bear), (grey, wolf)]
    println(colors.zip(animals) {
            color, animal -> "The $animal is $color"                // [The fox is red, The bear is brown, The wolf is grey]
    })
}
fun func6C() {
    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())                                    // ([one, two, three, four], [1, 2, 3, 4])
}


// ----------------------------------------------------------------------
// ASSOCIATION
// (build maps from the collection elements and certain values associated with them)
// ----------------------------------------------------------------------
fun func6D() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })                    // {one=3, two=3, three=5, four=4}
}
fun func6E() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateBy { it.first().uppercaseChar() })     // {O=one, T=three, F=four}
}



// ----------------------------------------------------------------------
// FLATTEN
// ----------------------------------------------------------------------
fun func6F() {
    val numbers = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numbers.flatten())                                      // [1, 2, 3, 4, 5, 6, 1, 2]
}



// ----------------------------------------------------------------------
// FLATMAP (map+flatten)
// ----------------------------------------------------------------------
data class LineItem(val myList:List<String>)
fun func6G() {
    val orders = listOf(
        LineItem(listOf("one", "two", "three")),
        LineItem(listOf("four", "five", "six")),
        LineItem(listOf("seven", "eight"))
    )
    println(orders.flatMap { it.myList })                       // [one, two, three, four, five, six, seven, eight]
}
