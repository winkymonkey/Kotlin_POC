package src.j_collections

// ----------------------------------------------------------------------
// FETCH ELEMENTS FROM COLLECTIONS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func4A()
    func4B()
}



// ----------------------------------------------------------------------
private val numsList = listOf(1, 2, 3)
private val peopleMap = mapOf(Pair("John", 20), Pair("Harry", 45))



// ----------------------------------------------------------------------
// GET (readonly & mutable collections)
// ----------------------------------------------------------------------
fun func4A() {                                  // LIST or SET
    println(numsList.get(0))
    println(numsList[0])
}
fun func4B() {                                  // MAP
    peopleMap.get("Jerry")
    peopleMap["Jerry"]
}
