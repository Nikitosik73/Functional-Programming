package create_high_function

fun main() {
    val result = modifyString("Hello, world!") { it.toUpperCase() }
    println(result)
}

fun modifyString(string: String, modify: (String) -> String) : String {
    return modify(string)
}