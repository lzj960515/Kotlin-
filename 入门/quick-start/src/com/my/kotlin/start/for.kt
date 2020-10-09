package com.my.kotlin.start

/**
 * for循环
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items)
        println(item)

    for(index in items.indices)
        println("item at $index is ${items[index]}")
}