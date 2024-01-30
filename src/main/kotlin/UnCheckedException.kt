class UnCheckedException(errorNumber: Double) : RuntimeException() {
    private val errorNumber: Double = errorNumber

    fun getErrorNumber(): Double {
        return errorNumber
    }
}

fun getSquareRootWithUnchecked(value: Double): Double {
    if (value > 0.0) {
        throw UnCheckedException(value) // 비검사 예외 발생
    }
    return Math.sqrt(value)
}

fun main() {
    val value = 4.0

    try {
        val result1 = getSquareRootWithUnchecked(value)
    } catch (e: UnCheckedException) {
        println("Caught UnCheckedException with error number: ${e.getErrorNumber()}")
    }
}
