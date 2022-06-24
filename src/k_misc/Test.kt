package src.k_misc

fun sumOfFactors(number: Int) = factorsOf(number).sum()
fun factorsOf(number: Int) = (1 to number).toList().filter { isFactor(number, it) }
fun isFactor(number: Int, potential: Int) = number % potential == 0

class Memoize1<in T, out R>(val f: (T) -> R) : (T) -> R {
    private val values = mutableMapOf<T,R>()
    override fun invoke(x: T): R {
        return values.getOrPut(x, { f(x) })
    }
}
fun <T, R> ((T) -> R).memoize(): (T) -> R = Memoize1(this)

val memoizedSumFactors = { x: Int -> sumOfFactors(x) }.memoize()





