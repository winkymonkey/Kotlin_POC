package pack01_basic

// ----------------------------------------------------------------------
// USAGE OF VAL & VAR
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func2A()
    func2B()
    func2C()
}



// ----------------------------------------------------------------------
fun func2A() {
    val str1 = "John"
    // str1 = "Harry"                   // we CANNOT update its value because it's declared as 'val', hence cannot be modified
}

fun func2B() {
    var str2 = "John"                   // so let's change it to 'var' so that we can modify its value
    str2 = "Harry"
    // str2 = null                      // we CANNOT assign it to null
}

fun func2C() {
    var str3:String? = "John"           // so let's make it "Nullable String"
    str3 = "Harry"
    str3 = null
    // println(str3.length)             // we CANNOT do such operations because it can cause NPE at runtime
}

fun func2D() {
    var str4:String? = "John"
    str4 = "Harry"
    println( (str4 ?: "").length )      // we used ELVIS OPERATOR for safety
}



// ----------------------------------------------------------------------
class Person2E(val name:String, val age:Int)
fun func2E() {
    val p = Person2E("John", 30)
    //p.name = "Jonny"                          // We CANNOT update its value because it's declared as 'val', hence cannot be modified
    //p.age = 40                                // We CANNOT update its value because it's declared as 'val', hence cannot be modified
}

class Person2F(var name:String, var age:Int)     // Now we change the properties to 'var', so that we can change its value
fun func2F() {
    val p = Person2F("John", 30)
    p.name = "Jonny"                            // now we can safely update 'name' attribute
    p.age = 40                                  // now we can safely update 'age' attribute

    //p.name = null                             // But we CANNOT make it NULL because it's NOT NULLABLE
    //p.age = null                              // But we CANNOT make it NULL because it's NOT NULLABLE
}

class Person2G(var name:String?, var age:Int?)     // Now we declare it as NULLABLE, so that we can make it null
fun func2G() {
    val pers = Person2G("John", 30)
    pers.name = null                               // now we can safely make it NULL
    pers.age = null                                // now we can safely make it NULL

    // However, below operations are NOT allowed, as update of a NULLABLE property can cause NPE
    // val newName = p.name.length
    // val newAge = p.age + 1
}

class Person2H(var name:String?, var age:Int?)     // Now we declare it as NULLABLE, so that we can update its value
fun func2H() {
    val pers = Person2H("John", 30)
    val newName = (pers.name ?: "").length         // now we can safely use these operations
    val nextAge = (pers.age ?: 0) + 1              // now we can safely use these operations
}
