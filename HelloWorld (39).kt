fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.

fun displayAlertMessage(operatingSystem:String, emailId:String): String{
  
  return "There's a new sign-in request on Chrome OS for your Google Account sample@gmail.com."
  
  
}