package com.my.kotlin.start

/**
 * when表达式
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun describe(obj: Any): String{
    return when(obj){
        1 -> "one"
        is Long -> "Long"
        !is String -> "Not a String"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
}

fun main(args: Array<String>) {
    println(describe(1))
}