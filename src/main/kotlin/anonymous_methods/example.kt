package anonymous_methods

fun main() {

    val sum = {a: Int, b: Int -> a + b}
    val sum1: (Int, Int) -> Int = {a, b -> a + b}

    println(sum1(10, 2))

    val square: (Int) -> Int = { it * it }
    val square1 = { length: Int -> length * length }
    println(square(5))

    // лямбда функиция для вычисления периметра прямоугольника

    // лямбда функциия для вывода имени

    // лямбда функция котороя сортирует массив в обратном порядке

}