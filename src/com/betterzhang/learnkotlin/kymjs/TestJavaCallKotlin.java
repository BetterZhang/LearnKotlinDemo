package com.betterzhang.learnkotlin.kymjs;

/**
 * Created by IntelliJ IDEA.
 * Author : Andrew Zhang
 * Email  : betterzhang.dev@gmail.com
 * Time   : 2017/07/06 上午 11:26
 * Desc   : description
 */
public class TestJavaCallKotlin {

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty("hello"));
        System.out.println(StringUtils.isEmpty(""));

        System.out.println(hasEmpty("hello", "world", ""));
    }

    public static boolean hasEmpty(String... strArray) {
        for (String str : strArray) {
            if ("".equals(str) || str == null) {
                return true;
            }
        }
        return false;
    }

}
