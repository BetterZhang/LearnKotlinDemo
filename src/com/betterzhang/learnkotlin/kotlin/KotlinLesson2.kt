package com.betterzhang.learnkotlin.kotlin

import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/21 下午 1:43
 * Desc   : 习惯用法
 */

// 创建DTOs（POJOs/POCOs）
// 会为Customer类提供以下功能:
// ---所有属性的getters(对于var定义的还有setter)
// ---equals()
// ---hashCode()
// ---toString()
// ---copy()
// ---所有属性的component1()、component2()......等等
data class Customer(val name: String, val email: String)
data class User(val name: String, val age: Int)

fun foo(a: Int = 0, b: String = "") {}

fun test1(x: Any): String {
    when(x) {
        is User     -> return "User"
        is Customer -> return "Customer"
        else        -> return "Unknown"
    }
}

// 创建单例
object Resource {
    val name = "Name"
}

fun transform(color: String): Int {
    return when(color) {
        "Red"  -> 0
        "Green" -> 1
        "Blue"  -> 2
        else    -> throw IllegalArgumentException("Invalid color param value")
    }
}

fun transform2(color: String): Int = when(color) {
    "Red"       -> 0
    "Green"     -> 1
    "Blue"      -> 2
    else        -> throw IllegalArgumentException("Invalid color param value")
}

fun main(args: Array<String>) {

    val list = listOf(2, 3, -2, 9)
//    val positives = list.filter { x -> x > 0 }
    val positives = list.filter { it > 0 }
    for (item in positives) {
        println(item)
    }

    val name = "Xiao Ming"
    println("Name is $name")

    println(test1(User("John", 21)))
    println(test1(Customer("Lucy", "Lucy@gmail.com")))

    val map = hashMapOf<String, String>()
    map.put("one", "1")
    map.put("two", "2")

    map["one"] = "4"

    for ((k, v) in map) {
        println("$k -> $v")
    }

    for (i in 1..10) {
        print(i)
    }
    println()

    for (i in 1 until 10) {
        print(i)
    }
    println()

    for (i in 2..10 step 2) {
        print(i)
    }
    println()

    for (i in 10 downTo 1) {
        print(i)
    }
    println()

    val x = 20
    if (x in 1..10) {
        println("x fits the range")
    } else {
        println("x is not fit the range")
    }

    val listStr = listOf("a", "b", "c")
    val map1 = mapOf("a" to 1, "b" to 2, "c" to 3, "d" to "hello")
    println(map1["b"])
    for ((k, v) in map1) {
        println("$k -> $v")
    }

    // 延迟属性
//    val p: String by lazy {  }

    // 扩展函数
    fun String.spaceToCamelCase() {

    }
    "Convert this to camelcase".spaceToCamelCase()

    val files = File("Test").listFiles()
    // if not null
    println(files?.size)
    // if not null and else
    println(files?.size ?: "empty")
    // if null执行一个语句
    val data = hashMapOf<String, String>()
    data.put("name", "betterzhang")
    data.put("email", "betterzhang.dev@gmail.com")
    val email = data["email"] ?: throw IllegalStateException("Email is missing")
    println(email)

    // if not null
    val data1: String? = null
    data1?.let {
        println("data is not null")
    }

    println(transform("Red"))
    println(transform("Blue"))
//    println(transform("gray"))

    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalArgumentException(e)
    }

    println(foo(2))

    val array = arrayOfMinusOnes(5)
    for (a in array) {
        println(a)
    }

    println(theAnswer1())
    println(theAnswer2())

    println(transform2("Green"))

    val myTurtle = Turtle()
    // 画一个100像素的正方形
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

    // java 7的try with resources
//    val stream = Files.newInputStream(Paths.get("/some/file.txt"))
//    stream.buffered().reader().use { reader ->
//        println(reader.readText())
//    }

    // 使用可空布尔值
    val b: Boolean? = null
    if (b == true) {
        println("b is true")
    } else {
        println("b is false or null")
    }

}

fun count() {
    val a = 10 / 2
//    val a = 10 / 0
}

fun foo(param: Int): String {
    val result = if (param == 1)
        return "one"
    else if (param == 2)
        return "two"
    else
        return "three"
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(3) }
}

fun theAnswer1() = 42

fun theAnswer2(): Int {
    return 45
}

class Turtle {
    fun penDown() {}
    fun penUp() {}
    fun turn(degrees: Double) {}
    fun forward(pixels: Double) {}
}

// 对于需要泛型信息的泛型函数的适宜形式
//inline fun <reified T: Any> Gson.fromJson(json): T = this.fromJson(json, T::class.java)