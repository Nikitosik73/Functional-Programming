package anonymous_methods

fun main() {

    // лямбда функиция для вычисления периметра прямоугольника
    val perimeter = { length: Int, width: Int -> (length + width) * 2 }
    println(perimeter(10, 5))

    // лямбда функциия для вывода имени
    val sayHello: (String) -> Unit = { println("Hello, $it") }
    sayHello("Nikita")

    // лямбда функция котороя сортирует массив в обратном порядке
    val arraySorted: (MutableList<Int>) -> List<Int> = {
        for (i in 1 until it.size) {
            for (j in it.size - 1 downTo i) {
                if (it[j] > it[j - 1]) {
                    val temp = it[j]
                    it[j] = it[j - 1]
                    it[j - 1] = temp
                }
            }
        }
        it
    }
    val numbers = mutableListOf(5, 3, 2, 6, 1, -1, -2, 0, -10)
    val result = arraySorted(numbers).filter { number: Int -> number % 2 == 0 }
    println(result)
}