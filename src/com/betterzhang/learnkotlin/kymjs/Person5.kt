package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 9:35
 * Desc   : description
 */
class Person5(private var name: String) {

    private var description: String? = null

    constructor(name: String = "name", description: String = "description") : this(name) {
        this.description = description
    }

    internal fun sayHello() {
        println("Hello $name $description")
    }

}