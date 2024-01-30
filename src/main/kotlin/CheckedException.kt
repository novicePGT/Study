/**
 * 예외처리
 *
 * 예외 처리는 실행중인 프로그램의 비정상적인 종료를 막고, 상태를 정상상태로 유지하는 것이 목적이다.
 *
 * 에러: 심각한 수준의 오류로 어플리케이션에서 제어할 수 없어서 비검사 예외에 해당.
 * 예외: 예상 가능하고, 개발자가 만들기도 하고 처리도 할 수 있어서 검사 예외에 해당.
 *
 * 명시적 방법: 코드를 직접 호출한 쪽에서 오류가 발생할 수 있음을 인지할 수밖에 없도록 하는 방법( 검사 예외 )
 * 암시적 방법: 코드를 호출하는 쪽에 알리지만 호출하는 쪽에서 오류를 신경쓰지 않아도 되는 방법( 비검사 예외 )
 *
 * 검사 예외: Exception [ IOException, SQLException... ]
 * 비검사 예외: Error [ ThreadDead, OutOfMemory, StackOverFlow... ]
 *
 * Throw: 예외를 강제로 발생시켜서 상위 블럭이나 catch 문으로 예외를 던진다.
 * Throws: 예외가 발생하면 상위 메서드로 예외를 던진다.
 */

class CheckedException(errorNumber: Double) : Exception() { // 검사 예외가 발생한다고 알림
    private val errorNumber: Double = errorNumber

    fun getErrorNumber() : Double {
        return errorNumber
    }
}

fun getSquareRoot(value: Double): Double {
    if (value < 0.0) {
        throw CheckedException(value) // 오류가 있을 시 검사 예외 발생
    }
    return Math.sqrt(value)
}
