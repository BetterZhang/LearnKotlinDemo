package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 上午 10:02
 * Desc   : description
 */

fun main(args: Array<String>) {
    var quantity = 5
    val price: Double = 20.3
    val name: String = "大米"

    println("单价: $price")
    println("数量: $quantity")
    println("产品: $name 总计: ${price * quantity}")

    val x = 3
    val arr = arrayListOf("1", "2", "3")
    println(arr.size)
    println(arr.lastIndex)

    if (x in 1..5)
        println("OK")

    if (x !in 0..arr.lastIndex)
        println("Out")

    for (x in arr)
        print(x)
    println()

    if ("1" in arr)
        println("Yes")

    cases(1)
    cases("hello")
    cases("name")
    cases(false)

    println(getStringLength("name"))
    println(getStringLength(false))

    var data1: String? = "abc"
    data1?.let { println("data is not null") }

    var data2: String? = null

    println(say1("say1"))
    println(say2("say2"))
    println(say3("say3"))

    println(say4())
    println(say4("say4"))
    println(say5())
    println(say5("John", "Simth"))

    println(getIntValue(5))

    val firstName: String = "Andrew"
    val lastName: String? = null

    println("my name is ${getName(firstName, lastName)}")


    var a: String? = null
    println(a?.length)

    println(StringUtils.isEmpty("haha"))
    println(StringUtils.isEmpty2(""))

    println(StringUtils2.isEmpty("Kotlin"))

}

fun say1(str: String): String {
    return str
}

fun say2(str: String): String = str

fun say3(str: String) = str

fun say4(str: String = "hello") = str

fun say5(firstName: String = "Andrew", lastName: String = "Zhang") = firstName + " " + lastName

fun getIntValue(value: Int) = value

fun cases(obj: Any) {
    when (obj) {
        1 -> println("第一项")
        "hello" -> println("这个是字符串hello")
        is Long -> println("这是一个Long类型数据")
        !is String -> println("这不是String类型的数据")
        else -> println("else类似于Java中的default")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
//    if (obj !is String) {
//        return 0
//    }
    return null
}

fun hasEmpty1(vararg strArray: String?): Boolean {
    for (str in strArray) {
        if ("".equals(str) || str == null) {
            return true
        }
    }
    return false
}

fun hasEmpty2(vararg strArray: String?): Boolean {
    for (str in strArray) {
        str ?: return true
    }
    return false
}

fun checkName(name: String?): String = name ?: "Unknown"

fun getName(firstName: String?, lastName: String? = "unknown"): String {
    if (hasEmpty2(firstName, lastName)) {
        lastName?.let { return@getName "${checkName(firstName)} $lastName" }
        firstName?.let { return@getName "$firstName ${checkName(lastName)}" }
    }
    return "$firstName $lastName"
}