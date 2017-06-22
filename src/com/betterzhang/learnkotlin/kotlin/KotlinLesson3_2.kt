package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/22 上午 11:09
 * Desc   : 基础---包
 */

// 默认导入的包
// ---kotlin.*
// ---kotlin.annotation.*
// ---kotlin.collections.*
// ---kotlin.comparisons.*(自1.1起)
// ---kotlin.io.*
// ---kotlin.ranges.*
// ---kotlin.sequences.*
// ---kotlin.text.*

// 根据目标平台还会导入额外的包
// -JVM
//     java.lang.*
//     kotlin.jvm.*
// -JS
//     kotlin.js.*


// 导入
// 可以导入一个单独的名字，如import foo.Bar
// 也可以导入一个作用域下的所有内容（包、类、对象等），如import foo.*
// 如果出现名字冲突，可以使用 as 关键字在本地重命名冲突项来消歧义，如:
// import foo.Bar   // Bar可以访问
// import bar.Bar as bBar // bBar代表"bar.Bar"

// 关键字 import 并不仅限于导入类；也可用它来导入其他声明:
// ---顶层函数及属性
// ---在对象声明中声明的函数和属性
// ---枚举常量

// 与 Java 不同，Kotlin 没有单独的 "import static" 语法； 所有这些声明都用 import 关键字导入。