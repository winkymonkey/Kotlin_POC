package src.h_misc

import java.time.LocalTime

// ----------------------------------------------------------------------
// DIFFERENT TYPE OF STRINGS
// ----------------------------------------------------------------------
fun main(args: Array<String>) {
    func1A()
}



// ----------------------------------------------------------------------
val strings = listOf(
    "Hello World",
    "Hello\nWorld",
    "Current time is ${LocalTime.now()}",
    """We have
        multiple lines
      in this string
    """,
    """We have
        multiple lines
      in this string
    """.trimMargin("")
)

fun func1A() {
    strings.forEach(::println)              // used METHOD REFERENCE (i.e, for each string, call the "println()" on it)
}
