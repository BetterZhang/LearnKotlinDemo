package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 下午 5:05
 * Desc   : description
 */
class Person2(private var name: String) {

    init {
        name = "Andrew Zhang"
    }

    internal fun sayHello() {
        println("Hello $name")
    }

}