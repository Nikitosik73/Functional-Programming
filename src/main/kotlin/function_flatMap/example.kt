package function_flatMap

fun main() {

//    val revenueByWeek = listOf(
//        listOf(4, 5, 6, 2, 8),
//        listOf(2, 3, 8, 1, 5),
//        listOf(3, 5, 6, 2, 7),
//        listOf(6, 3, 4, 2, 1)
//    )
    // используем метод map
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it){
//            total.add(i)
//        }
//    }
    // используем метод flatMap
//    val total = revenueByWeek.flatten()
//    val average = total.average()
//    println(average)

    // колекция map должна быть не изменяемая
    val data = mapOf(
        "file1" to listOf(10, 15, 20, 25),
        "file2" to listOf(11, -16, 21, 26),
        "file3" to listOf(32, 47, 22, 27)
    )
    // метод value - обращаемся к значениям первого ключа и так далее
//    val average = data.flatMap { it.value }.average()
//    println(average)
    // если в каком-то файле отрицательное значение возраста, то этот файл нам брать не нужно, так как возраст отрицательным быть не может
    // метод all - проверяет все ли значения подходят под условие, если одно не подходит, то мы не берём этот файл
    val averageAll = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    // метод any - проверяет все значения и если хоть одно даёт true, то мы берём эти значения
    val averageAny = data.filter { it.value.any { it >= 0 } }.flatMap { it.value }.average()
    println(averageAll)
}