fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250

    val result = mobileScreenTime(timeSpentToday, timeSpentYesterday)
    println("Is today's screen time greater than yesterday's? $result")
}

fun mobileScreenTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    if (timeSpentToday > timeSpentYesterday) {
        return true
    } else {
        return false
    }
}
