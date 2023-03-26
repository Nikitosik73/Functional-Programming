package function_flatMap

import kotlin.math.min

fun main() {

    val data = mapOf(

        "Январь" to listOf(100, 100, 100, 100),
        "Февраль" to listOf(200, 200, -190, 200),
        "Март" to listOf(300, 180, 300, 100),
        "Апрель" to listOf(250, -250, 100, 300),
        "Май" to listOf(200, 100, 400, 300),
        "Июнь" to listOf(200, 100, 300, 300)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filter { it.value.all { it > 0 } }
    // средняя выручка в неделю
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средання выручка в неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMouth = listOfSum.average()

    println("Средання выручка в месяц: $averageMouth")
    println("Максимальнвя выручка в месяц: $max")
    println("Минимальная выручка в месяц: $min")
    // максмальная выручка в месяц
    val maxMouth = validData.filter { it.value.sum() == max }.keys
    print("Максимальная выручка в этих месяцах: ")
    for (mouth in maxMouth){
        print("$mouth ")
    }
    // минимальная выручка в месяц
    val minMouth = validData.filter { it.value.sum() == min }.keys
    print("\nМинимальная выручка в этих месяцах: ")
    for (mouth in minMouth){
        print("$mouth ")
    }
    // месяцы в которых произошла ошибка
    val invalidData = data.filterNot { it.value.all { it > 0 } }
    val errorMouth = invalidData.keys
    print("\nОшибки произошли в следующих месецах: ")
    for (mouth in errorMouth){
        print("$mouth ")
    }
}