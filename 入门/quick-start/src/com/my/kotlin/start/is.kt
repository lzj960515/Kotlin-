package com.my.kotlin.start

/**
 * 类型检测与自动类型转换
 *
 * is 运算符检测一个表达式是否某类型的一个实例。
 * 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换
 * @author  Zijian Liao
 * @since 1.0.0
 */

fun getStringLength(obj: Any): Int{
    if(obj is String)
        return obj.length
    else
        throw RuntimeException("not String type!")
}

fun main() {
    print(getStringLength("1234"))
    print(getStringLength(1234))
}