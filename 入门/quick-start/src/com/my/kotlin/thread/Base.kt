package com.my.kotlin.thread

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

/**
 * 协程基础
 * @author  Zijian Liao
 * @since 1.0.0
 */
class Base {
    fun start() {
        /*GlobalScope.launch { // 在后台启动一个新的协程并继续
            delay(1000L) //非阻塞的等待1秒，默认时间单位毫秒
            println("World!") // 在延迟后打印输出
        }
        println("Hello")    // 协程已在等待时主线程还在继续
        Thread.sleep(2000L)    // 阻塞主线程 2 秒钟来保证 JVM 存活*/
        thread {
            Thread.sleep(2000L)
            println("World!")
        }
        println("Hello")
        Thread.sleep(2000L)
    }

}
fun main () {
    val base = Base()
    base.start()
}