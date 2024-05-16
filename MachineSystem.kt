package com.rizeq.coffeemachine

fun main () {

    makingCoffee(1)
    makingCoffee(3)
    makingCoffee(5)
    makingCoffee(0)
    makingCoffee(-2)


}

fun makingCoffee(sugarCubes: Int) {

    if (sugarCubes == 1) {
        println("You added $sugarCubes sugar cube in your coffee:)")
    }else if (sugarCubes == 0) {
        println("You did not add any sugar cubes in your coffee:)")
    }else if (sugarCubes < 0) {
        println("negative numbers are considered as an valid value")
    }else{
        println("You added $sugarCubes sugar cubes in your coffee:)")
    }

}