package high_function

import kotlin.random.Random

fun main() {

    // моё решение

//    val randomNumbers = List(1000) { Random.nextInt(0, 1000) }
    // a
//    val newRandomNumber = randomNumbers.filter { it % 3 == 0 || it % 5 == 0 }
//    for (number in newRandomNumber){
//        println(number)
//    }
    // b
//    val doubledRandomNumber = newRandomNumber.map { it * it }
//    for (i in doubledRandomNumber){
//        println(i)
//    }
    // c
//    val sortedDoubledRandomNumber = doubledRandomNumber.sortedDescending()
//    for (number in sortedDoubledRandomNumber){
//        println(number)
//    }
    // d
//    val stringNumber = sortedDoubledRandomNumber.map { "$it" }
//    for (number in stringNumber){
//        println()
//    }

    // решение Сумина
    val numbers = List(1000) { Random.nextInt(0, 1000) }
    val result = numbers.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (res in result){
        println(res)
    }
}

