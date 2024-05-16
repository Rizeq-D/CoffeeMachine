package com.rizeq.coffeemachine

fun main () {

    var customerName = ""
    var sugarCubes = 0

    while (true) {

    println("Please enter your name:")
    customerName = readLine() ?: ""

        if (customerName.isBlank() || !customerName.all { it.isLetter() }) {
            println("Invalid name. Please enter a valid name consisting of only letters.")
            continue
        }

    println("Please enter the number of sugar cubes you would like to add:")
    sugarCubes = readLine()?.toIntOrNull() ?: -1

        if (sugarCubes < 0) {
            println("Invalid number of sugar cubes. Please enter a non-negative number.")
            continue
        }
        
        break
    }

    makingCoffee(sugarCubes, customerName)

}

fun makingCoffee(sugarCubes: Int, customerName: String) {

    if (sugarCubes == 1) {
        println("You added $sugarCubes sugar cube in your coffee:) \n" +
                "coffee for $customerName")
    }else if (sugarCubes == 0) {
        println("You did not add any sugar cubes in your coffee:), your coffee is sugar free \n" +
                "coffee for $customerName")
    }else if (sugarCubes < 0) {
        println("negative numbers are considered as an valid value \n" +
                "coffee for $customerName")
    }else{
        println("You added $sugarCubes sugar cubes in your coffee:) \n" +
                "coffee for $customerName")
    }

}