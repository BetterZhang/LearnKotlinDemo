package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 9:31
 * Desc   : description
 */
class Person4(private var name: String = "default") {

    internal fun sayHello() {
        println("Hello $name")
    }

}