package com.betterzhang.learnkotlin.kotlin

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/06/23 上午 9:48
 * Desc   : 类和对象---属性和字段
 */

// Kotlin的类可以有属性，属性用关键字var声明为可变的，val关键字声明为只读的
class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""
    var state: String? = ""
    var zip: String = ""
}

// 要使用一个属性，只要用名称引用它即可，就像 Java 中的字段
fun copyAddress(address: Address): Address {
    // Kotlin中没有new关键字
    val result = Address()
    // 将调用访问器
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    result.zip = address.zip
    return result
}

class Test {

//    var allByDefault: Int?// 语法错误，需要显式初始化器
    var initialized = 1     // 类型Int，默认getter和setter

    // 只读属性不允许setter
//    val simple: Int?        // 类型Int，默认getter，必须在构造函数中初始化
    val inferredType = 1    // 类型Int，默认getter

//    val isEmpty: Boolean
//            get() = this.size == 0

    var stringRepresentation: String
            get() = this.toString()
            set(value) {
//                setDataFromString(value) // 解析字符串并赋值给其他属性
            }

}