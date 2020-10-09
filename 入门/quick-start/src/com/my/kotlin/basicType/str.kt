package com.my.kotlin.basicType

/**
 * 字符串
 * @author  Zijian Liao
 * @since 1.0.0
 */
fun main() {
    val str = "123456"
    for(c in str)
        println(c)

    //val s = 1 + "123" 报错，字符串连接时字符应在开头
    val s = "123" + 1

    val text = """
        for(c in "foo")
            print(c)
    """
    println(text)

    // 默认 | 用作边界前缀，但也可以选择其他字符并作为参数传入，比如 trimMargin(">")。
    val textTrim = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

    val textTrim2 = """
    >Tell me and I forget.
    >Teach me and I remember.
    >Involve me and I learn.
    >(Benjamin Franklin)
    """.trimMargin(">")
    println(textTrim2)

    // 字符串模板
    val name = "jack"
    println("hello $name")
    println("hello '$'")

}