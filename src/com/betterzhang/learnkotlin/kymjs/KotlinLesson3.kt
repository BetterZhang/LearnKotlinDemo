package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 下午 1:45
 * Desc   : description
 */

fun main(args: Array<String>) {
    `is`()

    // 会抛出空指针异常
    var p: Person? = null
    p!!.printName()
}

fun `is`() {}