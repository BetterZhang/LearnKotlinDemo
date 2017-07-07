package com.betterzhang.learnkotlin.kymjs


/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 10:25
 * Desc   : 扩展方法
 */

open class Animal

class Dog : Animal() {
    fun bark(): String {
        return "dog bark"
    }
}

var animal2: Animal? = Dog()

object Main {

    fun Animal.bark() = "animal"
    fun Dog.bark() = "dog"

    fun Animal.printBark(anim: Animal) {
        println(anim.bark())
    }

    @JvmStatic fun main(args: Array<String>) {
        // 因为扩展方法是静态解析的，在添加扩展方法的时候类型为Animal，
        // 那么即便运行时传入了子类对象，也依旧会执行参数中声明时类型的方法。
        Animal().printBark(Dog())

        var animal: Animal? = Dog()
        if (animal is Dog) {
            println(animal.bark())
        }

        // 如果智能转换的对象是一个全局变量，这个变量可能在别的地方
        // 被改变赋值，所以你必须手动判断与转换它的类型。
        if (animal2 is Dog) {
            println((animal2 as Dog).bark())
        }
    }

}