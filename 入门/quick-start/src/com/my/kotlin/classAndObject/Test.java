package com.my.kotlin.classAndObject;

/**
 * 测试java操作kotlin
 *
 * @author Zijian Liao
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Util util = new Util();
        long time = util.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());
    }
}
