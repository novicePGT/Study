import java.io.BufferedReader
import java.io.FileReader
import java.lang.NumberFormatException

/**
 * 예외처리
 *
 * Throw: 예외를 강제로 발생시켜서 상위 블럭이나 catch 문으로 예외를 던진다.
 * Throws: 예외가 발생하면 상위 메서드로 예외를 던진다.
 *
 * Kotlin 에서는 throws가 없음
 * -> 자바는 예외 처리를 강제하지만 실제로는 프로그래머들이 의미없이 예외를 던지거나 예외를 처리하되 무시하는 코드를 작성하는 경우가 흔하기 때문이다.
 *
 * try catch finally
 * try를 고차함수로 쓰는법
 * try with resource -> 자원의 획득과 처리를 쉽게 해주는 구문
 */

class CheckedExceptionV2(errorNumber: Double) : Exception() {
    private val errorNumber: Double = errorNumber

    fun getErrorNumber(): Double {
        return errorNumber
    }
}

// 코틀린의 throw 예제
fun tryCatchWithFinally() {
    val value = 0.1

    try {
        if (value > 0.0) {
            throw CheckedExceptionV2(value)
        }
    } catch (exception: CheckedExceptionV2) {
        println("exception with error number: ${exception.getErrorNumber()}")
    } finally {
        println("---END---")
    }
}

// try catch 를 고차함수로 사용하는 법
fun tryCatchWithLambda() {
    val value = try {
        Integer.parseInt("abc")
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    }
    println(value)
}

// 코틀린의 자원관리 예제, try with resource
fun tryWithResource(path: String): String {
    BufferedReader(FileReader(path)).use { bufferedReader ->
        return bufferedReader.readLine()
    }
}

//public String readLineFromFile(String path) throws IOException {
//    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//        return br.readLine();
//    }
//}

fun main() {
    tryCatchWithLambda()
    tryWithResource("abcdefg")
    tryCatchWithFinally()
}
