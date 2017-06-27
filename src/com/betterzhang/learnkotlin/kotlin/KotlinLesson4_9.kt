package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 3:38
 * Desc   : 类和对象---嵌套类
 */

// 嵌套类
class Outer1 {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}

// 内部类
class Outer2 {
    private val bar: Int = 15
    inner class Inner {
        fun foo() = bar
    }
}

// 匿名内部类


fun main(args: Array<String>) {
    val demo1 = Outer1.Nested().foo()
    println(demo1)

    val demo2 = Outer2().Inner().foo()
    println(demo2)
}

