package function_with_let

val numbers: MutableList<Int>? = mutableListOf()

fun main() {
    // используем метод let, потому что наша коллекция нулабельна
    numbers?.let {
        // используем метод with, чтобы не обращаться к numbers
        with(numbers) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (res in result){
                println(res)
            }
        }
    }
}