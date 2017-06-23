package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 2:58
 * Desc   : 类和对象---数据类
 */

data class User1(val name: String, val age: Int)

// 在 JVM 中，如果生成的类需要含有一个无参的构造函数，则所有的属性必须指定默认值
data class User2(val name: String = "", val age: Int = 0)

//fun copy(name: String = this.name, age: Int = this.age) = User1(name, age)

fun main(args: Array<String>) {
    // 复制
    val jack = User1(name = "jack", age = 20)
    val olderJack =  jack.copy(age = 18)
    println(olderJack.toString())

    // 数据类和解构声明
    val jane = User1("jane", 33)
    val(name, age) = jane
    println("$name, $age years of age")
}