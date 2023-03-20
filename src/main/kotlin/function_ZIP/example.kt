package function_ZIP

fun main() {

    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 0..1000){
        names.add("Name №$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for (user in users){
        println("Name: ${user.first} Phone: ${user.second}")
    }
}