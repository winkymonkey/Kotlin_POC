package pack09_collections

// ----------------------------------------------------------------------
// TRAVERSE COLLECTIONS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func3A()
    func3B()
    func3C()
    func3D()
    func3E()
    func3F()
}



// ----------------------------------------------------------------------
private val numsList = listOf(1, 2, 3)
private val peopleMap = mapOf(Pair("John", 20), Pair("Harry", 45))



// ----------------------------------------------------------------------
// FOR IN (readonly & mutable collections)
// ----------------------------------------------------------------------
fun func3A() {                                      // LIST or SET
    for (n in numsList)
        println("n=$n")
}
fun func3B() {                                      // MAP
    for (entry in peopleMap)
        println("name=${entry.key}, age=${entry.value}")
    for ((name, age) in peopleMap)
        println("name=$name, age=$age")
}



// ----------------------------------------------------------------------
// FOR EACH (readonly & mutable collections)
// ----------------------------------------------------------------------
fun func3C() {                                      // LIST or SET
    numsList.forEach{ n -> println(n) }
    numsList.forEach{ println(it) }
    numsList.forEach(::println)
}
fun func3D() {                                      // MAP
    peopleMap.forEach{ entry -> println(entry) }
    peopleMap.forEach{ println(it) }
    peopleMap.forEach(::println)
}



// ----------------------------------------------------------------------
// ITERATOR (readonly & mutable collections)
// ----------------------------------------------------------------------
fun func3E() {
    val itr = numsList.iterator()
    while (itr.hasNext()) {
        println(itr.next())
    }
}



// ----------------------------------------------------------------------
// MUTABLE ITERATOR (mutable collections)
// (we can remove/insert/replace elements from a collection while iterating it)
// ----------------------------------------------------------------------
fun func3F() {
    val numsListMutable = mutableListOf(1, 2, 3)
    val itr = numsListMutable.iterator()
    while (itr.hasNext()) {
        itr.remove()
    }
}
