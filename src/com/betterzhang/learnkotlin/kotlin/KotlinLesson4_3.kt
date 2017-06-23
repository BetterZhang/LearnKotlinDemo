package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 上午 10:47
 * Desc   : 类和对象---接口
 */

// 使用关键字interface来定义接口
interface MyInterface1 {
    fun bar()
    fun foo() {
        // 可选的方法体
    }
}

// 实现接口（一个类或者对象可以实现一个或多个接口）
class Child : MyInterface1 {
    override fun bar() {
        // 方法体
        TODO("not implemented")
    }
}

// 接口中的属性
interface MyInterface2 {
    val prop: Int       //抽象的
    val propertyWithImplementation: String
            get() = "foo"

    fun foo() {
        print(prop)
    }
}

class Child2 : MyInterface2 {
    override val prop: Int = 29
}

// 解决覆盖冲突
// 实现多个接口的时候，可能会遇到同一方法继承多个实现的问题
interface M {
    fun foo() { println("M") }
    fun bar()
}

interface N {
    fun foo() { println("N") }
    fun bar() { println("bar") }
}

class P : M {
    override fun bar() {
        println("bar")
    }
}

class Q : M, N {
    override fun foo() {
        super<M>.foo()
        super<N>.foo()
    }

    override fun bar() {
        super<N>.bar()
    }
}

fun main(args: Array<String>) {
    val q = Q()
    q.foo()
    q.bar()
}

