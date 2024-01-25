import java.lang.Exception

enum class Permissions {
    READ,
    WRITE,
    EXECUTE,
    NONE
}

fun main() {
    for (permission in Permissions.values()) {
        if (checkPermission(permission)) {
            println("$permission 권한이 있습니다.")
        } else {
            println("$permission 권한이 없습니다.")
        }
    }
}

fun checkPermission(permission: Permissions): Boolean {
    return when (permission) {
        Permissions.READ -> true
        Permissions.WRITE -> true
        Permissions.EXECUTE -> true

        else -> throw Exception("권한예외 발생, 권한체크를 확인해주세요.")
    }
}
