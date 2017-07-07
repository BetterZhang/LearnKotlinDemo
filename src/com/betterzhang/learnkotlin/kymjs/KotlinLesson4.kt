package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 下午 5:03
 * Desc   : description
 */

fun main(args: Array<String>) {

    Person1("Person1").sayHello()
    Person2("Person2").sayHello()
    // 调用次级构造函数
    Person3("Person3", "Description").sayHello()
    // 调用主构造函数
    Person3("other Person3").sayHello()

    // 主构造函数所有的参数都有默认值的时候，编译器会生成一个额外的无参构造函数，它将使用默认值
    Person4("Person4").sayHello()
    Person4().sayHello()

    // 次级构造函数所有的参数都有默认值的时候，编译器会生成一个额外的无参构造函数，它将使用默认值
    Person5().sayHello()

}