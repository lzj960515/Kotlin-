package com.my.kotlin.start

/**
 * 区间
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    //使用 in 运算符来检测某个数字是否在指定区间内
    val x = 10
    val y = 9
    if (x in 1..y + 1) {
        println("fits in range")
    }

    //检测某个数字是否在指定区间外
    val list = listOf("a", "b", "c")
    if (-1 !in list.indices) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of list indices range, too")
    }

    //区间迭代
    for (a in 1..5) {
        print(a)
    }
    println()
    //数列迭代
    for (a in 1..10 step 2) {
        print(a)
    }
    println()
    for (a in 9 downTo 0 step 3)
        print(a)


}
