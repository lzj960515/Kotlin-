package com.my.kotlin.start

/**
 * 变量
 * @author  Zijian Liao
 * @since 1.0.0
 */
//顶层变量
val PI = 3.14
var k = 0

fun main() {
    //val关键字定义的变量只能赋值一次
    val x = 1 //自动推断类型
    //x = 2 报错 Val cannot be reassigned
    //不赋初始值必须声明变量类型
    val y: Int
    y = 2

    //var关键字定义的变量可以重复赋值
    var z = 1
    z += 1

}