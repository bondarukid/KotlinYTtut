package org.example

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65

fun main()
{
    // >, <, >=, <=, ==, !=, ===, !==
    // Result only true or false

    val userAge: Int = 42
    val result: Boolean = (userAge >= AGE_OF_MAJORITY) && !(userAge <= RETIREMENT_AGE)
    val result2: Boolean = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE
    println("Result is: $result")
    println("Result2 is: $result2")
    
    println("////////////////////")

    println(0 < -1)
    println(1 == 1)
    println(2 == 3)
    println(7 != 6)

    // &&, ||, !

    println("////////////////////")

    val a: Boolean = true
    val b: Boolean = !a
    println("Result is: $b")
}