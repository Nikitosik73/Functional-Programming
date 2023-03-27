package extensions_function

fun main() {
//    val age = 10
//    if (age.isAgeValid()){
//        println("Valid!")
//    }
//    if (age.isAgeValid()){
//        println("Valid too")
//    }
//    if (age.isAgeValid()){
//        println("Valid too 2")
//    }
//    println(age.isSimpled())

    val list = listOf<Int>()
    val string = "Nikita"
    myWith(list) {

    }
}

fun myWith(list: List<Int>, operations: List<Int>.() -> Unit) {
    list.operations()
}

fun myWith(string: String, operations: String.() -> Unit) {
    string.operations()
}

inline fun <T, R> myWith(obj: T, operations: T.() -> R): R {
    return obj.operations()
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isSimpled(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}