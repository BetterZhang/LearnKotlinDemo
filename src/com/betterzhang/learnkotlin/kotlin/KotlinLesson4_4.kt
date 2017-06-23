package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 下午 1:08
 * Desc   : 类和对象---可见性修饰符
 */

/*
    类、对象、接口、构造函数、方法、属性和它们的 setter 都可以有 可见性修饰符。（getter总是与属性有着相同的可见性）
    在 Kotlin 中有这四个可见性修饰符：private、 protected、 internal 和 public。
    如果没有显式指定修饰符的话，默认可见性是 public。
*/

// ---如果你不指定任何可见性修饰符，默认为 public，这意味着你的声明将随处可见；
// ---如果你声明为 private，它只会在声明它的文件内可见；
// ---如果你声明为 internal，它会在相同模块内随处可见；
// ---protected 不适用于顶层声明。

private fun foo() {}    // 在KotlinLesson4_4.kt内可见

public var bar: Int = 5 // 该属性随处可见
    private set         // setter只在KotlinLesson4_4.kt可见

internal val baz = 6    // 相同模块内可见

// 对于类内部声明的成员：
// ---private 意味着只在这个类内部（包含其所有成员）可见；
// ---protected —— 和 private一样 + 在子类中可见。
// ---internal —— 能见到类声明的 本模块内 的任何客户端都可见其 internal 成员；
// ---public —— 能见到类声明的任何客户端都可见其 public 成员。
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4           // 默认public

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a不可见
    // b、c、d可见
    // Nested和e可见

    override val b = 5  // b为protected

    fun test() {
//        println(a)
        println(b)
        println(c)
        println(d)
        println(Nested().e)
    }
}

class Unrelated(o: Outer) {
    // o.a和o.b不可见
    // o.c和o.d可见（相同模块）
    // Outer.Nested不可见，Nested::e也不可见

    fun test() {
        val o = Outer()
        println(o.c)
        println(o.d)
    }
}

// 构造函数
class Master private constructor(a: Int) {
    // 构造函数私有的，默认情况下，所有的构造函数都是public
}

// 局部声明
// 局部变量、函数和类不能有可见性修饰符

// 模块
// 可见性修饰符internal意味着该成员只在相同模块内可见，更具体地说，一个模块是编译在一起的一套Kotlin文件
// ---一个IntelliJ IDEA模块
// ---一个Maven或者Gradle项目
// ---一次<kotlinc> Ant任务执行所编译的一套文件