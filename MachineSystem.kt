package com.rizeq.coffeemachine
data class CoffeeDetails(
    var sugarCubes: Int,
    var customerName: String,
    var size: String,
    var milk: Boolean
)
fun main () {
    var customerName: String
    var sugarCubes: Int
    var size: String
    var milk: Boolean

    while (true) {
        customerName = getCustomerName()
        if (customerName.isBlank() || !customerName.all { it.isLetter() }) {
            println("Invalid name. Please enter a valid name consisting of only letters.")
            continue
        }

        sugarCubes = getSugarCubes()
        if (sugarCubes < 0 || sugarCubes > 10) {
            println("Invalid number of sugar cubes. Please enter a number between 0 and 10.")
            continue
        }

        size = getSize()
        if (size.isBlank()) {
            println("Invalid size. Please enter a valid size.")
            continue
        }

        val milkInput = getMilk()
        if (milkInput == null) {
            println("Invalid input for milk. Please enter 'yes' or 'no'.")
            continue
        }else{
            milk = milkInput
        }

        break
    }

    val coffeeDetails = CoffeeDetails(sugarCubes, customerName, size, milk)
    makingCoffee(coffeeDetails)

}
    fun getCustomerName(): String {
        println("Please enter your name:")
        return readLine() ?: ""
    }
    fun getSugarCubes(): Int{
        println("Please enter the number of sugar cubes you would like to add:")
        return readLine()?.toIntOrNull() ?: -1
    }
    fun getSize(): String {
        println("Please enter the size of you coffee:\n" +
                "Number 1 for Small\n" +
                "Number 2 for Medium\n" +
                "Number 3 for Large")
        return when (readLine()?.toIntOrNull() ?: -1) {
            1 -> "Small"
            2 -> "Medium"
            3 -> "Large"
            else -> ""
        }
    }
    fun getMilk(): Boolean? {
        println("would you like to add milk? please write yes or no.")
        return when(readLine()?.trim()?.toLowerCase()) {
            "yes" -> true
            "no" -> false
            else -> false
        }
    }
fun makingCoffee(details: CoffeeDetails) {

    with (details) {
        when(sugarCubes) {
            0 -> println("You did not add any sugar cubes in your coffee:), your coffee is sugar free \n" +
                    "coffee for $customerName")
            1 -> println("You added $sugarCubes sugar cube in your coffee:) \n" +
                    "coffee for $customerName")
            else -> println("You added $sugarCubes sugar cubes in your coffee:) \n" +
                    "coffee for $customerName")
        }
        println("Coffee size: $size")
        println("With milk: ${if (milk) "Yes" else "No"}")
    }

}





















