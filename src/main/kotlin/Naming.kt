
// T 는 팀
class Team {
    var firstNameOfPlayer: List<String> = listOf("강", "박", "이") // 팀에 있는 선수들의 성
    var score = 30 // 팀의 점수

    /**
     * @param n은 선수의 성
     * @return 선수의 성이 팀에 속해 있는 경우
     */
    fun containsPlayer(n: String): Boolean {
        return firstNameOfPlayer.contains(n)
    }

    /**
     * @return 팀의 점수
     */
    @JvmName("getScore1")
    fun getScore(): Int {
        return score
    }
}

