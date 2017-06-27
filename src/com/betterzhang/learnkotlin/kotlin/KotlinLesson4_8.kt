package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 3:22
 * Desc   : 类和对象---泛型
 */

class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {

    val box1: Box<Int> = Box<Int>(2)
    val box2 = Box(5)

}
