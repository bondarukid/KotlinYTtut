package org.example

fun main() {
    str1()
    println("/////////////////////////////")
    str2()
    println("/////////////////////////////")
    multiString()
    println("/////////////////////////////")
    specialChar()
}

// конквтенвция строк
fun str1() {
    val greeting: String = "Hello"
    val space: Char = ' '
    val userName: String = "Star Lord"

    println(greeting + ", " + userName + "!" + space + "What is your main question?")
}

// интерполяция строк
fun str2() {
    val greeting: String = "Hello"
    val userName: String = "Star Lord"

    println("$greeting, $userName! What is your main question?")
    println("To witch you can respond ${40 + 2}")
}

// мультистрока
fun multiString() {
    println("Just multiString")

    var multiString: String = """
        aaaa
      vvvvv
              dddddddd
    """

    println(multiString)

    println(".trimIndent multiString")

    multiString = """
        aaaa
      vvvvv
              dddddddd
    """.trimIndent()

    println(multiString)

    println(".trimMargin multiString")

    multiString = """
        |aaaa
      |vvvvv
              |dddddddd
    """.trimMargin()

    println(multiString)
}

//
fun specialChar() {
    val string = "And he said - \"it is magnificent!\""

    println(string)
}