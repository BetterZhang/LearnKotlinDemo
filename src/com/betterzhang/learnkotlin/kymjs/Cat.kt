package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 11:16
 * Desc   : 动态代理
 */

interface Animals {
    fun bark()
}

class Dogs : Animals {
    override fun bark() {
        println("Wang Wang")
    }

}

class Cat(animal: Animals) : Animals by animal {

}

fun main(args: Array<String>) {
    Cat(Dogs()).bark()
}