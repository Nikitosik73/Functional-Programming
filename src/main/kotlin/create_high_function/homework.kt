package create_high_function

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    modifyCollections(numbers) {
        println(it.sum())
    }
}
/*
когда создаётся функция, которая принимает в параметре другую функцию,
то привызове этой функции создаётся, объект анонимного класса, это очень
ресурсоёмкий процесс, поэтому на необходимо избегать этого, для этого,
при создании функции, которая будет принимать в параметре другую функцию,
необходимо добавить ключевое слово inline
 */
inline fun modifyCollections(numbers: List<Int>, modifyNumbers: (List<Int>) -> Unit) {
    modifyNumbers(numbers)
}
