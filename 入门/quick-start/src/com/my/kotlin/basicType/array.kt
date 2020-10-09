package com.my.kotlin.basicType

/**
 * 数组
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    // 创建一个数组
    val arrayOf = arrayOf(1, 2, 3, 4)
    arrayOf[0] = arrayOf[1] + arrayOf[2]
    arrayOf.forEach { print(it) }
    println()

    // 创建一个空数组
    val arrayOfNulls = arrayOfNulls<Int>(5)

    // 使用函数创建一个数组
    val arrayOfFunc = Array(5){ i -> i*i }
    arrayOfFunc.forEach { print(it) }

    // 创建一个原生类型数组
    val intArr = intArrayOf(1, 2, 3, 4)
    intArr[0] = intArr[1]

}