fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = substract(firstNumber, secondNumber)
    val anotherResult = substract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

// Define add() function below this line

fun substract(a:Int,b:Int):Int{
  return a - b; 
}