fun main() {
    val steps = 4000
    val caloriesBurned = calculateCaloriesForStep(steps);
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun calculateCaloriesForSteps(steps: Int): Double {
    val  caloriesPerStep = 0.04
  return  steps * caloriesPerStep
}


