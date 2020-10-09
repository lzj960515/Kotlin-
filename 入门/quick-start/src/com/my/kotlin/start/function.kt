package com.my.kotlin.start

/**
 * 函数
 *
 * fun 函数名(变量: 类型[= 默认值])[: 返回值] {
 *    函数体
 * }
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun printMessage(message: String) {
    println(message)
}

fun printMessageWithDefault(name: String, call: String = "Hello"){
    println("$call $name !")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun multiply(x: Int, y: Int) = x * y
/**
 * 函数返回无意义的值
 */
/*fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}*/

/**
 * Unit 类型可省略
 */
fun printSum(a: Int, b:Int){
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    /*printMessage("Hello World!")
    println(sum(1, 2))
    printMessageWithDefault("lucy", "Bye")
    println(multiply(2, 3))*/

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia.likes(claudia)
    println(sophia.likedPeople[0].name)
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}