@file:Suppress("UNREACHABLE_CODE")


fun main(args: Array<String>) {
    print("사용자의 이름을 입력해주세요: ")
    val userName = readLine()
    println(userName)

    println("지금부터 사용자의 이름을 외칩니다.")
    val pieceOfName = splitUserName(userName)
    for (piece in pieceOfName!!) {
        println("$piece!!")
    }
}

private fun splitUserName(name: String?): List<String>? {
    if (name?.isBlank() == true) {
        return throw IllegalArgumentException("이름은 비워둘 수 없습니다.")
    }
    return name?.split(" ")
}
