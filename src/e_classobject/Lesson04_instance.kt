package src.e_classobject

// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func4A()
}



// ----------------------------------------------------------------------
class Person4A
class Person4B {  }
class Person4C constructor(val name:String, val age:Int)
class Person4D(val name:String, val age:Int)
class Person4E {
    constructor(name:String, age:Int) {
        //
    }
}
class Person4F(val name:String) {
    constructor(name:String, age:Int):this(name) {
        //
    }
}


fun func4A() {
    val p1 = Person4A()
    val p2 = Person4B()
    val p3 = Person4C("John", 40)
    val p4 = Person4D("John", 40)
    val p5 = Person4E("John", 40)

    val p6 = Person4F("John")
    val p7 = Person4F("John", 40)
}
