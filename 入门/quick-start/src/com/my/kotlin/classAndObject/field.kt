package com.my.kotlin.classAndObject

/**
 * 属性
 * @author  Zijian Liao
 * @since 1.0.0
 */
class Person{
    var firstName: String = "jack"
        private set
    var lastName: String? = null
    var age: Int = 1
    var isYoung = false
        get
        set(value) {field = value}

}

fun main() {
    val person = Person()
    println(person.isYoung)
    person.isYoung = true

}