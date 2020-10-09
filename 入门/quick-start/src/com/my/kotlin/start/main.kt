package com.my.kotlin.start

/**
 * main
 * @author  Zijian Liao
 * @since 1.0.0
 */

fun main(){
    val customer = Customer("Phase")
    println(customer.name)
    println(customer.placeOrder())
//    println("Hello World!")
    println("What's your name ?")
    val name = readLine();
    println("Hello $name!")
}