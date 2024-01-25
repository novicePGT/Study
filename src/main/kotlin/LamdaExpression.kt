
// 익명 함수(람다 표현식)를 사용하지 않은 경우
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    val squaredList = squareNumbers(numbers)

    println("각 항목의 제곱수: $squaredList")
}

fun squareNumbers(numbers: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (number in numbers) {
        result.add(square(number))
    }
    return result
}

fun square(x: Int): Int {
    return x * x
}
