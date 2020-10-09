package com.my.kotlin.start

/**
 * 字符串模板
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    var a = 1
    val s1 = "a is $a"
    println(s1)

    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}