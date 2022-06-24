package src.j_collections

// ----------------------------------------------------------------------
// COLLECTION Types
//  - List, Set, Map
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A()
}


// ----------------------------------------------------------------------
// A pair of interfaces represent each collection type:
//  - ReadOnly Interfaces ---- provides operations for accessing collection elements.
//  - Immutable Interfaces --- extends the corresponding read-only interface with write operations (add, remove, update)
// ----------------------------------------------------------------------



// ----------------------------------------------------------------------
// The read-only collection types are COVARIANT.
// This means that, if a "Child" class inherits from "Parent", we CAN use a "List<Child>" where the "List<Parent>" is required.
//
// On the other hand, mutable collection types are NOT covariant.
// This means that, if a "Child" class inherits from "Parent", we CANNOT use a "MutableList<Child>" where the "MutableList<Parent>" is required.
// Because if "MutableList<Child>" was a subtype of "MutableList<Parent>", we can insert "Child2","Child3" into it. Hence, it will violate the contract of "Child"
// ----------------------------------------------------------------------
// Maps are covariant on the value type, but NOT on the key type.
// ----------------------------------------------------------------------
open class Shape
class Rectangle: Shape()

fun func1A() {
    val rectangles = listOf(Rectangle(), Rectangle())
    val shapes:List<Shape> = rectangles

    val mrectangles = mutableListOf(Rectangle(), Rectangle())
    //val mshapes:MutableList<Shape> = mrectangles                  // NOT POSSIBLE
}



// ----------------------------------------------------------------------
// List --- ArrayList (default), linkedList
// Set ---- LinkedHashSet (default), HashSet
// Map ---- LinkedHashMap (default), HashMap
// ----------------------------------------------------------------------
