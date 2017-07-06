package com.betterzhang.learnkotlin.kymjs

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 下午 1:51
 * Desc   : 伴生对象
 */
class StringUtils2 {

    companion object {
        fun isEmpty(str: String): Boolean {
            return "" == str
        }
    }

}