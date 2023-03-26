package function_ZIP

fun main() {

    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()

    for (i in 1..1000){
        names.add("Name $i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }

    val fullInfo = names.zip(phones)
    for (info in fullInfo){
        println("Names: ${info.first} Phones: ${info.second}")
    }
}