package com.my.kotlin.classAndObject

/**
 * 函数式接口
 * @author  Zijian Liao
 * @since 1.0.0
 */
// 函数式接口
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { it % 2 == 0 }

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
}