package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/14 上午 9:06
 * Desc   : description
 */

fun main(args: Array<String>) {
    var x = -1
    when (x) {
        2 -> println("等于2")
        if (x > 0) 1 else -1 -> println("大于0并等于1，或小于0并等于-1")
        in 1..5 -> println("范围匹配1-5")
        !in 6..9 -> println("不是6-9")
        is Int -> println("类型判断")
        else -> println("else")
    }

    when {
        x in 7..10 -> println("大于6小于等于10")
        x < 6 -> println("小于6")
        else -> println("else")
    }

    // 常量数组int[][][] arrs = new int[3][2][1];
    val arrs = Array(3) {Array(2){IntArray(1)}}

    val list = listOf("one", "two", "three", "four")
    for (i in list.indices) {
        print(list[i] + " ")
    }
    println()
    for (i in 2..list.size - 1) {
        print(list[i] + " ")
    }
    println()
    for (i in list.size - 1 downTo 0) {
        print(list[i] + " ")
    }
    println()
    for (item in list) {
        print(item + " ")
    }
    println()
    for ((i, item) in list.withIndex()) {
        println("$i -> $item")
    }
    list.forEach { print(it + " ") }
    println()
    
    list.forEachIndexed { i, s ->
        println("$i -> $s")
    }

    list.forEachIndexed(object : (Int, String) -> Unit {
        override fun invoke(p1: Int, p2: String) {
            println("$p1 -> $p2")
        }
    })
    
    var age: String? = null
    var ageInt = age!!.toInt()
    println(ageInt)
}