package function_ZIP

fun main() {

//    val fullNames = mutableListOf<String>()
//    for (i in 0..1000){
//        println("Фамилия $i Имя $i")
//    }
//
//    val lastnames = fullNames.map { it.substringBefore(" ") }
//    val names = fullNames.map { it.substringAfter(" ") }
//
//    val users = lastnames.zip(names)
//    for (user in users){
//        println("LastName: ${user.first} Name: ${user.second}")
//    }

    // решение сумина с использованием ООП на будующее
    val fullNames = mutableListOf<String>()
    for (i in 0..1000){
        println("Фамилия $i Имя $i")
    }

    val users = fullNames.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (user in users){
        println("LastName: ${user.first} Name: ${user.second}")
    }
}