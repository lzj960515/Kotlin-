package com.my.kotlin.start

/**
 * 类与对象
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    val user = User("jack", 12)
    user.printInfo()
    println(user.name)
}

class User(val name: String, private val age: Int){
    fun printInfo(){
        println("name is $name , age is $age")
    }
}