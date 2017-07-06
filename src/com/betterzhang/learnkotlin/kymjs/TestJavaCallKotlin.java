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
//        System.out.println(StringUtils.isEmpty(null));

        System.out.println(StringUtils.INSTANCE.isEmpty2("haha"));

        System.out.println(StringUtils2.Companion.isEmpty("Kotlin"));

        System.out.println(hasEmpty("hello", "world", ""));

        // 调用Kotlin包级函数
//        PackageLevelFuncKt.testPackageLevelFunc();      // 默认生成的
        PackFun.testPackageLevelFunc();                   // @file:JvmName("PackFun")自定义生成的
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
