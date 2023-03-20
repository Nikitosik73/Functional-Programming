package endless_sequences

fun main() {
    // моё решение
    val array = generateSequence(1) { it + 1 }

    val result = array.map { "Employee №$it" }.take(100)
    for (res in result){
        println(res)
    }

    // решение сумина
//    val array = generateSequence("Сотрудник №1") {
//        val index = it.substring(11).toInt()
//        "Сотрудник №${index + 1}"
//    }
//    val employees = array.take(100)
//    for (employee in employees){
//        println(employee)
//    }
}