package com.my.kotlin.start

/**
 * 集合
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    //集合迭代
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items)
        println(item)

    //使用in判断集合内是否包含某实例，感觉应该不会这样用，应该是用if
    when {
        "apple" in items -> println("apple is fine")
        "banana" in items -> println("banana is fine too")
    }

    //map
    val map = mapOf("key1" to "value1","key2" to "value2")
    for((key,value) in map){
        println("$key -> $value")
    }

    //lambda表达式
    val fruits = setOf("banana", "avocado", "apple", "kiwifruit")
    var toList = fruits
        .filter { it -> it.startsWith("a") }
        .sorted()
        .map { it.toUpperCase() }
        .toList()
    for(item in toList)
        println(item)
}