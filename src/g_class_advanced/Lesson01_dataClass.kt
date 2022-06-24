package src.g_class_advanced

// ----------------------------------------------------------------------
// DATA CLASSES
// ----------------------------------------------------------------------
// A lot of times we create classes just to contain data and these classes might be simple, but they still come with a lot of baggage.
// So, we have to create our field, getters & setters, meaningful equals() & hashCode(), a nice toString().
// For this, Kotlin introduces Data Class
// ----------------------------------------------------------------------
// Data Class give us the following for free:
//      - equals(), hashCode(), toString()
//      - componentN() --------- To provide DESTRUCTURING capability (create multiple variables at one go using the values inside the object)
//      - copy() & copy(...) --- To provide COPY capability (create mutable objects having "all same fields" OR "a few modified fields")
// ----------------------------------------------------------------------
// Data Class must fulfill the following requirements:
//      - The primary constructor needs to have at least one parameter.
//      - All primary constructor parameters need to be marked as val or var.
// ----------------------------------------------------------------------
// NOTE:
//  - Data Class may extend other classes
//  - If a supertype has componentN() functions that are open and return compatible types,
//          the corresponding functions are generated for the data class and override those of the supertype. Otherwise, it reports an error.
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A()
    func1B()
    func1C()
    func1D()
}



// ----------------------------------------------------------------------
// DESTRUCTURING
// ----------------------------------------------------------------------
data class Person1A(val name:String, val age:Int, val location:String, val salary:Int)

fun func1A() {
    val p1 = Person1A("Tom", 70, "India", 10000)

    // Using DESTRUCTURING (instead of extracting each fields one by one, we can use DESTRUCTURING feature)
    val(name1, age1, location1, salary1) = p1
    println("$name1 --- $age1 --- $location1 --- $salary1")
}



// ----------------------------------------------------------------------
// We can manually add "component1(), component2() etc." functions in regular classes to use the DESTRUCTURING feature.
// ----------------------------------------------------------------------
class Person1B(val name:String, val age:Int, val location:String, val salary:Int) {
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = location
    operator fun component4() = salary
}

fun func1B() {
    val p1 = Person1B("Tom", 70, "India", 10000)

    // Using DESTRUCTURING (instead of extracting each fields one by one, we can use DESTRUCTURING feature)
    val(name1, age1, location1, salary1) = p1
    println("$name1 --- $age1 --- $location1 --- $salary1")
}



// ----------------------------------------------------------------------
// COPY
// ----------------------------------------------------------------------
data class Person1C(val name:String, val age:Int)

fun func1C() {
    val p1 = Person1C("Tom", 70)

    // create mutable object having "all same fields"
    val p2 = p1.copy()
    println(p1 == p2)

    // create mutable object having "a few modified fields"
    val p3 = p1.copy(age=44)
    println(p1 == p3)
}



// ----------------------------------------------------------------------
// EXCLUDE PROPERTY FROM AUTOMATIC DESTRUCTURING & COPY
// ----------------------------------------------------------------------
data class Person1D(val name:String, val age:Int) {
    var salary:Int = 0
}

fun func1D() {
    val p1 = Person1D("John", 30)
    val p2 = Person1D("John", 30)
    p1.salary = 10000
    p2.salary = 20000

    println(p1 == p2)           // TRUE         // equals() -------- "salary" is not considered
    println(p1.hashCode())                      // hashCode() ------ "salary" is not considered
    println(p1)                                 // toString() ------ "salary" is not considered
    val(name1, age1) = p1                       // DESTRUCTURING --- "salary" is not considered
    val p3 = p1.copy()                          // COPY ------------ "salary" is not considered
}


