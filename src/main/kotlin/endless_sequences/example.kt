package endless_sequences

import kotlin.random.Random

fun main() {
    val numbers = (0..1000).toMutableList()
    val employees = numbers.map { "Employee №$it" }
    // метод take позволяет выбрать из коллекии, то количество, которое нам необходимо, сначала колллекции
    val firstEmployee = employees.take(30)
//    for (employee in firstEmployee){
//        println(employee)
//    }
    // метод takeLast позволяет выбрать из коллекии, то количество, которое нам необходимо, с конца колллекции
    val lastEmployee = employees.takeLast(30)
//    for (employee in lastEmployee){
//        println(employee)
//    }
    // метод drop позволяет удалить из коллекии, то количество, которое нам необходимо, сначала колллекции
    val firstDrop = employees.drop(30)
//    for (employee in firstDrop){
//        println(employee)
//    }
    // метод drop позволяет удалить из коллекии, то количество, которое нам необходимо, сначала колллекции
    val lastDrop = employees.dropLast(30)
//    for (employee in lastDrop){
//        println(employee)
//    }

    // бесконечные последователльности

    val array = generateSequence { Random.nextInt(0, 100) }
    val evenList = array.take(10)
    for (even in evenList){
        println(even)
    }
}