package com.my.kotlin.start

/**
 * 空值与null检测
 *
 * 当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。
 * @author  Zijian Liao
 * @since 1.0.0
 */
//? 表示允许为空
fun parseInt(string: String): Int? {
    return Integer.parseInt(string)
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    //println(x * y) 直接使用 `x * y` 会导致编译错误，因为它们可能为 null
    if (x != null && y != null) {
        // 在空检测后，x 与 y 会自动转换为非空值（non-nullable）
        println(x * y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun main() {
    printProduct("2", "3")
}