package com.my.kotlin.classAndObject

/**
 * 接口
 * @author  Zijian Liao
 * @since 1.0.0
 */
interface MyInterface{
    val prop: Int
    val prop2: Int
        get() = 1

    fun foo()
    fun bar(){
        // 可选的方法体
        println("bar...")
    }
    fun test(){
        println("test...")
    }
}

class Child: MyInterface{
    override val prop: Int
        get() = 1

    override fun foo() {
        println("foo...")
    }
}



fun main() {
    val child = Child()
    child.bar()
    child.foo()
    println(child.prop)
    println(child.prop2)
}