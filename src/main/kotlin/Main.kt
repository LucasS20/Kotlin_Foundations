fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    interestingThings.forEach { println(it) }
    interestingThings.forEachIndexed { index, s -> println("$s is at index $index") }
}

fun greetings(greeting: String) {
    println("$greeting World!")
}

