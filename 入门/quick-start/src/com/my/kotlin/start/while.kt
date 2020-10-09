package com.my.kotlin.start

/**
 * while 循环
 * @author  Zijian Liao
 * @since 1.0.0
 */

fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while(index < items.size){
        println("item at $index is ${items[index]}")
        ++index
    }
}