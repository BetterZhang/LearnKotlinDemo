package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 11:22
 * Desc   : 动态代理实现的伪多继承
 */

interface Animal2 {
    fun bark()
}

interface Food2 {
    fun eat()
}

class Delegate : Animal2, Food2 {
    override fun bark() {
        println("Miao")
    }

    override fun eat() {
        println("Mouse")
    }

}

class Cat2(animal: Animal2, food: Food2) : Animal2 by animal, Food2 by food {

}

fun main(args: Array<String>) {
    val delegate: Delegate = Delegate()
    Cat2(delegate, delegate).bark()
    Cat2(delegate, delegate).eat()
}