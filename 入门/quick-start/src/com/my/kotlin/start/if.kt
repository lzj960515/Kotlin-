package com.my.kotlin.start

/**
 * 条件表达式
 * @author  Zijian Liao
 * @since
 */

fun maxOf(x: Int, y: Int): Int{
    if(x > y){
        return x
    } else {
        return y
    }
}

fun minOf(x: Int, y: Int) = if (x > y) y else x

fun main() {
    println(maxOf(1, 2))
    println(minOf(1, 2))
}