package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 3:46
 * Desc   : 类和对象---枚举类
 */

// 枚举类的最基本的用法是实现类型安全的枚举
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// 初始化
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

// 枚举常量也可以声明自己的匿名类
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },
    TALKING {
        override fun signal() = WAITING
    };
    abstract fun signal(): ProtocolState
}

// 使用枚举常量
enum class RGB {
    RED, GREEN, BLUE
}

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}

fun main(args: Array<String>) {
    println(Color.RED.rgb)

    printAllValues<RGB>()
}