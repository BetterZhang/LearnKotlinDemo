package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 4:19
 * Desc   : 类和对象---委托
 */

interface BaseI {
    fun print()
}

class BaseImpl(val x: Int) : BaseI {
    override fun print() {
        print(x)
    }
}

class Drived(b: BaseI) : BaseI by b

fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Drived(b).print()
}