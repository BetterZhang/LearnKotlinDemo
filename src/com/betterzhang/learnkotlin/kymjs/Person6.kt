package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 下午 3:15
 * Desc   : description
 */
open class Person6(var perName: String) {

    // 必须加open，不加就相当于java的private final
    open fun test() {
        println("Person test method() $perName")
    }

    open fun move() {

    }

}