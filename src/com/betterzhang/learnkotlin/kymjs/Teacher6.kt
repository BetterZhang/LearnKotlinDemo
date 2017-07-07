package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 下午 3:18
 * Desc   : description
 */
class Teacher6(var teaName: String, id: Int) : Person6(teaName) {

    var tid = id

    override fun test() {
        println("Teacher test method() $teaName")
    }

    final override fun move() {

    }

}