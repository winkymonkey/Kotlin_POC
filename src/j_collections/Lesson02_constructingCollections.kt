package src.j_collections

import java.util.*

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func2A()
    func2B()
    func2C()
    func2D()
    func2E()
    func2F()
}



// ----------------------------------------------------------------------
// Construct from elements
// ----------------------------------------------------------------------
fun func2A() {
    val numsList1 = listOf(1, 2, 3)
    val numsList2 = mutableListOf(1, 2, 3)

    val numsSet1 = setOf(1, 2, 3)
    val numsSet2 = mutableSetOf(1, 2, 3)

    val peopleMap1 = mapOf(Pair("John", 20), Pair("Harry", 45))
    val peopleMap2 = mutableMapOf(Pair("John", 20), Pair("Harry", 45))
}



// ----------------------------------------------------------------------
// Create empty collections
// ----------------------------------------------------------------------
fun func2B() {
    val numsList = emptyList<Int>()
    val numsSet = emptySet<Int>()
    val numsMap = emptyMap<String,Int>()
}



// ----------------------------------------------------------------------
// Concrete Type Constructors
// ----------------------------------------------------------------------
fun func2C() {
    val nameList1 = ArrayList(listOf("John", "Harry", "Chris"))
    val nameList2 = LinkedList(listOf("John", "Harry", "Chris"))

    val numsSet1 = LinkedHashSet(setOf(1, 2, 3))
    val numsSet2 = HashSet(mutableSetOf(1, 2, 3))

    val peopleMap1 = LinkedHashMap(mapOf(Pair("John", 20), Pair("Harry", 45)))
    val peopleMap2 = LinkedHashMap(mutableMapOf(Pair("John", 20), Pair("Harry", 45)))
}



// ----------------------------------------------------------------------
// COPY (toList, toSet, toMap)
// (to create a collection with the same elements as an existing collection)
// (it creates shallow copy collections with references to the same elements. Hence any modification in elements reflects in all its scope.)
// ----------------------------------------------------------------------
class Person2D(var name:String)
fun func2D() {
    val p1 = Person2D("John")
    val p2 = Person2D("Harry")
    val sourceList = listOf(p1, p2)
    val destList = sourceList.toList()

    p1.name = "Jack"
    println(sourceList)             // Jack, Harry
    println(destList)               // Jack, Harry
}

// However, copied collections can grow or shrink independently
fun func2E() {
    val p1 = Person2D("John")
    val p2 = Person2D("Harry")
    val sourceList = mutableListOf(p1, p2)
    val destList = sourceList.toList()
    sourceList.add(Person2D("Maria"))

    println(sourceList)             // John, Harry, Maria
    println(destList)               // John, Harry
}



// ----------------------------------------------------------------------
// Converting from other collections
// ----------------------------------------------------------------------
fun func2F() {
    val sourceList = mutableListOf(1, 2, 3)
    val copySet = sourceList.toMutableSet()             // prepare set from list
    copySet.add(3)
    copySet.add(4)
    println(copySet)
}
