package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 下午 1:28
 * Desc   : description
 */

val test = if (5 > 3) {
    println("yes")
} else {
    println("no")
}

val printMsg = { msg: String ->
    println(msg)
}

fun main(args: Array<String>) {
    function()

    for (i in 1..100 step 20)
        print("$i ")

    println()

    for (i in 1.rangeTo(100) step 20)
        print("$i ")

    println()

    test

    { x: Int, y: Int -> println("${x + y}") }(5, 9)

    printMsg("Hello")
    printMsg.invoke("hello")
}

fun function() {
    val str = "Hello"

    fun say(count: Int = 5) {
        println(str)
        if (count > 0) {
            say(count - 1)
        }
    }

    say()
}