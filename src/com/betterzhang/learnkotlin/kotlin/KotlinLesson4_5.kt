package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 1:55
 * Desc   : 类和对象---扩展
 */

// Kotlin支持扩展函数和扩展属性

// 扩展函数（接收者类型：被扩展的类型来作为它的前缀）
fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]      // this对应该列表
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    val l = mutableListOf(1, 2, 3)
    for (i in l) {
        print(i)
    }
    println()
    l.swap(0, 1)
    for (i in l) {
        print(i)
    }
    println()

    printFoo(DD())

    E().foo()
    F().foo(1)

    val n = null
    println(n.toString() + ", ${n.toString() is String}")

    MyClass.Companion.foo()
    MyClass.foo()
}

// 当然，这个函数对任何 MutableList<T> 起作用，我们可以泛化它：
fun <T> MutableList<T>.swap2(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

open class CC
class DD : CC()
fun CC.foo() = "c"
fun DD.foo() = "d"
fun printFoo(c: CC) {
    println(c.foo()) // 输出c，因为调用的扩展函数只取决于参数c的声明类型，该类型是C类
}

// 如果我们调用 E 类型 e的 e.foo()，它将输出"member"，而不是"extension"
class E {
    fun foo() { println("member") }
}
fun E.foo() { println("extension") }

class F {
    fun foo() { println("member") }
}
fun F.foo(i: Int) { println("extension") }

// 可空接收者
fun Any?.toString(): String {
    if (this == null)
        return "null"
    // 空检测之后，this会自动转换为非空类型，所以下面的toString()解析为Any类的成员函数
    return toString()
}

// 扩展属性
val <T> List<T>.lastIndex: Int
    get() = size - 1

// 伴生对象的扩展
// 如果一个类定义有一个伴生对象，你也可以为伴生对象定义扩展函数和属性
class MyClass {
    companion object {}     // 将被称为Companion
}
fun MyClass.Companion.foo() {
    println("Companion")
}

class X {
    fun bar() {}
}
class Y {
    fun baz() {}
    fun X.foo() {
        bar()   // 调用X.bar
        baz()   // 调用Y.baz
    }
    fun caller(x: X) {
        x.foo() // 调用扩展函数
    }
}