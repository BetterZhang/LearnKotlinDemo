package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 下午 5:12
 * Desc   : description
 */
class Person3(private var name: String) {

    private var description: String? = null

    init {
        name = "Andrew Zhang"
    }

    // 次级构造函数
    constructor(name: String, description: String) : this(name) {
        this.description = description
    }

    internal fun sayHello() {
        println("Hello $name $description")
    }

}