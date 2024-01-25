

fun main() {
    val number = 5
    val result = factorialSum(number)
    println("$number 부터 0까지 계속 더하면 $result 입니다.")
}

fun factorialSum(number: Int): Int {
    var resultSum = 0
    if (number <= 0) {
        return 0
    } else {
        resultSum = number + factorialSum(number - 1)
    }
    return resultSum
}

