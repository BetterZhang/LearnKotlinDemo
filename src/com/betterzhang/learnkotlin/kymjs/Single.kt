package com.betterzhang.learnkotlin.kymjs


/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/07 上午 10:52
 * Desc   : 单例类设计
 */

class Single private constructor() {

    companion object {
        fun getInstance(): Single {
            return Holder.instance
        }
    }

    private object Holder {
        val instance = Single()
    }

}