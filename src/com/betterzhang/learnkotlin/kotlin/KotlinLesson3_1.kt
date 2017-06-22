package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/21 下午 3:12
 * Desc   : 基础---基本类型
 */

// Double -> 64
// Float  -> 32
// Long   -> 64
// Int    -> 32
// Short  -> 16
// Byte   -> 8
fun main(args: Array<String>) {

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println(oneMillion)

    val a: Int = 10000
    println(a == a)
    println(a === a)
    val boxdA: Int? = a
    val anotherBoxedA: Int? = a
    // 保留了相等性
    println(boxdA == anotherBoxedA)
    // 没有保留同一性
    println(boxdA === anotherBoxedA)


    // 较小的类型不能隐式转换为较大的类型，这意味着在不进行显式转换的情况下我们不能
    // 把Byte型值赋值给一个Int型变量
    val x: Int? = 1
//    val y: Long? = x

    val b: Byte = 100
//    val i: Int = b  // 错误
    // 我们可以显式转换来拓宽数字
    val i: Int = b.toInt() // 显式拓宽
    println(i)
//    i.toByte()
//    i.toShort()
//    i.toLong()
//    i.toFloat()
//    i.toDouble()
//    i.toChar()
    println(i.toLong())
    println("" + i.toChar())

    // 缺乏隐式类型转换并不显著，因为类型会从上下文推断出来，而算术运算会有重载做适当转换

    val l = 1L + 3 // Long + Int = Long
    println("l is $l, ${l is Long}")

    val z = (1 shl 2) and 0x000FF000
    println(z)

    println(decimalDigitValue('8'))

    val arr: IntArray = intArrayOf(1, 2, 3)
    arr[0] = arr[1] + arr[2]
    for (i in arr) {
        println(i)
    }

    val str: String = "hello"
    for (s in str) {
        println(s)
    }

    val s1 = "Hello World\n"
    println(s1)
    val s2 = "Hello World\\n"
    println(s2)

    val text = """
        for (c in "foo")
            print(c)
    """
    println(text)

    val text2 = """
        >Tell me and I forget.
        >Teach me and I remember.
        >Involve me and I learn.
        >(Benjamin Franklin)
        """.trimMargin(">")
    println(text2)

    val m = 10
    val ss = "m = $m"
    println(ss)

    val s = "abc"
    val string = "$s.length is ${s.length}"
    println(string)

    val price = """
    ${'$'}9.99
    """
    println(price)
}

fun check(c: Char) {
//    if (c == 1) { // 错误，类型不兼容，Char类型不能直接当做数字
//
//    }
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9') {
        throw IllegalArgumentException("Out of range")
    }
    return c.toInt() - '3'.toInt()
}