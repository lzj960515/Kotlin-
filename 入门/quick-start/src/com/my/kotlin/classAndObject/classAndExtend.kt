package com.my.kotlin.classAndObject

/**
 * 类与继承
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    val people = People("jack", 12)
    val filledRectangle = FilledRectangle()
    println(filledRectangle.fillColor)
}
// 默认为 public ,public修饰时 可省略 public constructor -> class People(val name: String){}
class People public constructor(val name: String){
    // init 类似 java static 今天代码块
    init {

    }
    init {

    }
    var _age: Int = 0

    // 如果类有一个主构造函数，每个次构造函数需要委托给主构造函数， 可以直接委托或者通过别的次构造函数间接委托。
    constructor(name: String, age: Int) : this(name) {
        _age = age
    }
}


// open 表示可继承
open class Rectangle {
    open fun draw() { println("Drawing a rectangle") }
    val borderColor: String get() = "black"
}
// class 类A : 父类
class FilledRectangle : Rectangle() {
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }

    val fillColor: String get() = super.borderColor
}

open class Polygon {
    open fun draw() {}
}
// abstract 表示抽象类
abstract class Triangle : Polygon() {
    abstract override fun draw()
}