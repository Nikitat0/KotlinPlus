package ru.nikitat.kotlinplus

public inline operator fun Byte.invoke(n: Int): Bool = this.toInt()(n)
public inline operator fun Byte.get(n: Int) = this.toInt()[n].toByte()
public inline operator fun Byte.get(from: Int, to: Int) = this.toInt()[from, to].toByte()

public inline operator fun Short.invoke(n: Int): Bool = this.toInt()(n)
public inline operator fun Short.get(n: Int) = this.toInt()[n].toShort()
public inline operator fun Short.get(from: Int, to: Int) = this.toInt()[from, to].toShort()

public inline operator fun Int.invoke(n: Int): Bool = (this shr n and 1) == 1
public inline operator fun Int.get(n: Int) = this shr n and 1
public inline operator fun Int.get(from: Int, to: Int) = this shr to and !(!0 shl from)

public inline operator fun Long.invoke(n: Int): Bool = (this shr n and 1) == 1L
public inline operator fun Long.get(n: Int) = this shr n and 1
public inline operator fun Long.get(from: Int, to: Int) = this shr to and !(!0L shl from)

// Bit operations

public inline operator fun Int.not() = this.inv()
public inline operator fun Long.not() = this.inv()

public inline infix fun Byte.shl(bitCount: Int) = (this.toInt() shl bitCount).toByte()
public inline infix fun Byte.shr(bitCount: Int) = (this.toInt() shr bitCount).toByte()
public inline infix fun Byte.ushr(bitCount: Int) = (this.toInt() ushr bitCount).toByte()
public inline infix fun Byte.and(other: Byte) = (this.toInt() and other.toInt()).toByte()
public inline infix fun Byte.or(other: Byte) = (this.toInt() or other.toInt()).toByte()
public inline infix fun Byte.xor(other: Byte) = (this.toInt() xor other.toInt()).toByte()
public inline fun Byte.inv() = this.toInt().inv().toByte()
public inline operator fun Byte.not() = this.inv()

public inline infix fun Short.shl(bitCount: Int) = (this.toInt() shl bitCount).toShort()
public inline infix fun Short.shr(bitCount: Int) = (this.toInt() shr bitCount).toShort()
public inline infix fun Short.ushr(bitCount: Int) = (this.toInt() ushr bitCount).toShort()
public inline infix fun Short.and(other: Short) = (this.toInt() and other.toInt()).toShort()
public inline infix fun Short.or(other: Short) = (this.toInt() or other.toInt()).toShort()
public inline infix fun Short.xor(other: Short) = (this.toInt() xor other.toInt()).toShort()
public inline fun Short.inv() = this.toInt().inv().toShort()
public inline operator fun Short.not() = this.inv()