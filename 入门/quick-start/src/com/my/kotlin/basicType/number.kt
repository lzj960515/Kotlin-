package com.my.kotlin.basicType

/**
 * 数字
 * 类型	大小（比特数）	最小值	最大值
    Byte	8	        -128	127
    Short	16	        -32768	32767
    Int	    32	        -2,147,483,648 (-2^31)	2,147,483,647 (2^31 - 1)
    Long	64	        -9,223,372,036,854,775,808 (-2^63)	9,223,372,036,854,775,807 (2^63 - 1)
 * @author  Zijian Liao
 * @since 1.0.0
 */

fun main() {
    // 所有以未超出 Int 最大值的整型值初始化的变量都会推断为 Int 类型。
    // 如果初始值超过了其最大值，那么推断为 Long 类型。 如需显式指定 Long 型值，请在该值后追加 L 后缀。
    val one = 1 // Int
    val threeBillion = 3_000_000_000 // Long
    val oneLong = 1L // Long
    val oneByte: Byte = 1

    // 对于以小数初始化的变量，编译器会推断为 Double 类型。 如需将一个值显式指定为 Float 类型，请添加 f 或 F 后缀。
    // 如果这样的值包含多于 6～7 位十进制数，那么会将其舍入。
    val pi = 3.14 // Double
    val e = 2.7182818284 // Double
    val eFloat: Float = 2.7182818284f // Float，实际值为 2.7182817 只保留有效数字7位
    println(eFloat)

    var toChar = one.toChar()
    //位运算
    val x = 1 shl 2
    println(x)
    // shl(bits) – 有符号左移
    // shr(bits) – 有符号右移
    // ushr(bits) – 无符号右移
    // and(bits) – 位与
    // or(bits) – 位或
    // xor(bits) – 位异或
    // inv() – 位非
}