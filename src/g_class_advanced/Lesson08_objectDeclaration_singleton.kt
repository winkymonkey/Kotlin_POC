package src.g_class_advanced

import java.util.*

// ----------------------------------------------------------------------
// OBJECT DECLARATION --- SINGLETON
// Read More: https://stackoverflow.com/questions/51834996/singleton-class-in-kotlin
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func8A()
}



// ----------------------------------------------------------------------
data class Customer8A(val id: UUID, val name:String)

// Below is called OBJECT DECLARATION. It's a way to create singleton object.
object CustomerManager8A {
    fun create(name:String, id: UUID):Customer8A {
        return Customer8A(id, name)
    }
    fun create2(name:String, id: UUID = UUID.randomUUID()):Customer8A {
        return Customer8A(id, name)
    }
    fun create3(name:String, id: UUID = UUID.randomUUID(), height:Double=6.0):Customer8A {
        return Customer8A(id, name)
    }
}

fun func8A() {
    val custA = CustomerManager8A.create("John", UUID.randomUUID())        // to refer the object, use its name directly (i.e. without creating constructor)
    println(custA)

    val custB = CustomerManager8A.create2("John")                          // "id" parameter will take the default value
    val custC = CustomerManager8A.create2("Henry", UUID.randomUUID())
    println(custB)
    println(custC)

    val custD = CustomerManager8A.create3("Henry", height=5.6)             // NamedParameter (skipping one variable)
    val custE = CustomerManager8A.create3(height=5.6, name="Henry")              // while using NamedParameter, the order of parameter doesn't matter
    println(custD)
    println(custE)
}
