package pack06_hierarchy

// ----------------------------------------------------------------------
// OVERRIDING METHODS
// ----------------------------------------------------------------------
// Functions of a class cannot be overridden in child classes by default.
// To achieve this
// - Parent class must mark the method as "OPEN"
// - Child class must mark the overridden method with "OVERRIDE"
// ----------------------------------------------------------------------
open class Parent2A {
    open fun draw() { }
    fun fill() { }
}
class Child2A:Parent2A() {
    override fun draw() { }
}
// ----------------------------------------------------------------------
// A member marked OVERRIDE is itself open, so it may be overridden in subclasses.
// To prohibit re-overriding, we have to mark the overridden method as "FINAL".
// ----------------------------------------------------------------------
class Child2B:Parent2A() {
    final override fun draw() { }
}



// ----------------------------------------------------------------------
// OVERRIDING PROPERTIES
// ----------------------------------------------------------------------
// The overriding mechanism works on properties in the same way that it does on methods.
// We can override a VAL property with a VAR property, but not vice versa.
