// 定义包
package com.betterzhang.learnkotlin.kotlin

// 导入包
import java.util.*

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/21 上午 9:09
 * Desc   : 基础语法
 */

fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

fun printSum1(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun test1() {
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3

    var x = 5;
    x += 1
    println("a = $a, b = $b, c = $c, x = $x")
}

fun test2() {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}

fun maxOf1(a: Int, b: Int): Int {
    if (a > b)
        return a
    else
        return b
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct1(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println( x * y)
    } else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

fun printProduct2(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x == null) {
        println("Wrong number format in arg1: '$arg1'")
        return
    }
    if (y == null) {
        println("Wrong number format in arg2: '$arg2'")
        return
    }
    println(x * y)
}

fun getStringLength1(obj: Any): Int? {
//    if (obj is String)
//        return obj.length
//    return null

    if (obj !is String)
        return null
    return obj.length
}

fun getStringLength2(obj: Any): Int? {
    if (obj is String && obj.length > 0)
        return obj.length
    return null
}

fun printLength1(obj: Any) {
    println("'$obj' string length is ${getStringLength1(obj) ?: "...err, not a string"}")
}

fun printLength2(obj: Any) {
    println("'$obj' string length is ${getStringLength2(obj) ?: "...err, is empty or not a string at all"}")
}

fun describe(obj: Any): String =
        when(obj) {
            1           -> "one"
            "Hello"     -> "Greeting"
            is Long     -> "Long"
            !is String  -> "Not a string"
            else        -> "Unknown"
        }

fun main(args: Array<String>) {
    print("sum of 3 and 5 is ")
    println(sum1(3, 5))

    println("sum of 19 and 23 is ${sum2(19, 23)}")

    println(printSum1(-1, 8))
    println(printSum2(-1, 8))

    test1()
    test2()

    println("max of 12 and 42 is ${maxOf1(12, 42)}")
    println("max of 30 and 20 is ${maxOf2(30, 20)}")

    printProduct1("6", "7")
    printProduct1("a", "7")
    printProduct1("a", "b")

    printProduct2("6", "9")
    printProduct2("a", "7")
    printProduct2("99", "b")

    printLength1("Incomprehensibilities")
    printLength1(1000)
    printLength1(listOf(Any()))

    printLength2("Incomprehensibilities")
    printLength2("")
    printLength2(1000)

    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))

    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")
    if (-1 !in 0..list.lastIndex)
        println("-1 is out of range")

    if (list.size !in list.indices)
        println("lise size is out of valid list indices range too")

    for (x in 1..5) {
        print(x)
        println()
    }
    for (x in 1..10 step 2) {
        print(x)
    }
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    println()

    for (item in items) {
        println(item)
    }

    when {
        "orange" in items -> println("juicy")
        "apple" in items  -> println("apple is fine too")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwi")
    fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}