fun main() {
    val firstUserEmailId = "user_one@gmail.com"
    val firstUserOperatingSystem = "Unknown_OS"

    // First user's alert message
    println(displayAlertMessage(firstUserOperatingSystem, firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    // Second user's alert message
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    // Third user's alert message
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

// Function to generate an alert message for any user
fun displayAlertMessage(operatingSystem: String, emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}


