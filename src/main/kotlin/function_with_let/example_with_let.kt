package function_with_let

var name: String? = "moscscas"

fun main() {
    // без использовани let
//    if (name == null){
//        return
//    }
//    if (name!!.length > 5){
//        println("Nikita")
//    }
    // let
//    name?.let {
//        if (it.length > 5){
//            println("fsajkfakf")
//        }
//    }
    // with
    val numbers = mutableListOf<Int>()
    with(numbers){
        for (i in 0 until 1000){
            add((Math.random() * 1000).toInt())
        }
        println("Среднее значение коллекции: ${average()}")
        println("Сумма коллекции: ${sum()}")
        println("Максимальное значение: ${max()}")
        println("Минимальное значение: ${min()}")
        println("Первое значение коллекции: ${first()}")
        println("Поледние значение коллекции: ${last()}")
    }
}