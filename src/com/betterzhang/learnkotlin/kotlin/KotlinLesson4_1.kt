package com.betterzhang.learnkotlin.kotlin

import java.util.logging.Logger


/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/22 下午 3:03
 * Desc   : 类和对象---类和继承
 */

// Kotlin中使用关键字class声明类
class Invoice {

}
// 类头和类体都是可选的，如果一个类没有类体，可以省略花括号
class Empty

// 构造函数
// 在Kotlin中的一个类可以有一个主构造函数和一个或多个次构造函数。主构造函数是类头的一部分：它跟在类名（和可选的类型参数）后
class Person1 constructor(firstName: String) {

}
// 如果主构造函数没有任何注解或者可见性修饰符，可以省略这个 constructor 关键字。
class Person2(firstName: String) {

}

class Customer1(name: String) {
    init {
        println("Customer initialized with value $name")
    }

    val customerKey = name.toUpperCase()
}

// 事实上，声明属性以及从主构造函数初始化属性，Kotlin有简洁的语法：
class Person3(val firstName: String, val lastName: String, var age: Int) {

}

//class Customer2 public @Inject constructor(name: String) {
//
//}

// 次构造函数
class Person4 {
    constructor(parent: Person4) {
//        parent.children.add(this)
    }
}

class Person5(val name: String) {
    constructor(name: String, parent: Person5) : this(name) {
//        parent.children.add(this)
    }
}

class DontCreateMe private constructor() {

}

class Customer3(val name: String = "")

// 创建类的实例
val invoice = Invoice()
val customer = Customer1("Joe Smith")

class Example // 从Any隐式继承，Any是所有类共同的超类

open class Base(p: Int) {
    open fun v() {}
    fun nv() {}
}

class Derived(p: Int) : Base(p) {
    override fun v() {
    }
}

open class AnotherDerived(p: Int) : Base(p) {
    final override fun v() {
    }
}


//open class Foo {
//    open val x: Int get {
//
//    }
//}
//class Bar : Foo() {
//    override val x: Int = ......
//}

interface Foo {
    val count: Int
}
class Bar1(override val count: Int) : Foo
class Bar2 : Foo {
    override val count: Int = 0
}


open class A {
    open fun f() {
        print("A")
    }
    fun a() {
        print("a")
    }
}
interface B {
    // 接口成员默认就是open的
    fun f() {
        print("B")
    }
    fun b() {
        print("b")
    }
}
class C : A(), B {
    override fun f() {
        super<A>.f()    // 调用A.f()
        super<B>.f()    // 调用B.f()
    }
}

// 抽象类
open class Base1 {
    open fun f() {}
}
abstract class Derived1 : Base1() {
    override abstract fun f()
}