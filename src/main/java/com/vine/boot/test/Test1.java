package com.vine.boot.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author tengyue(hk177955)
 * @date 2019-11-29 10:49
 */

public class Test1 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Test> clazz = Test.class;
        Method main = clazz.getDeclaredMethod("main", String[].class);
        // 静态方法不属于类，属于类所对应的class对象
        main.invoke(null, new Object[]{null});
    }

}
