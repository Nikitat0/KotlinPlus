package ru.nikitat.kotlinplus

inline operator fun Byte.invoke(n: Int): Bool = this.toInt()(n)
inline operator fun Byte.get(n: Int) = this.toInt()[n].toByte()
inline operator fun Byte.get(from: Int, to: Int) = this.toInt()[from, to].toByte()

inline operator fun Short.invoke(n: Int): Bool = this.toInt()(n)
inline operator fun Short.get(n: Int) = this.toInt()[n].toShort()
inline operator fun Short.get(from: Int, to: Int) = this.toInt()[from, to].toShort()

inline operator fun Int.invoke(n: Int): Bool = (this shr n and 1) == 1
inline operator fun Int.get(n: Int) = this shr n and 1
inline operator fun Int.get(from: Int, to: Int) = this shr to and !(!0 shl from)

inline operator fun Long.invoke(n: Int): Bool = (this shr n and 1) == 1L
inline operator fun Long.get(n: Int) = this shr n and 1
inline operator fun Long.get(from: Int, to: Int) = this shr to and !(!0L shl from)

// Bit operations

inline operator fun Int.not() = this.inv()
inline operator fun Long.not() = this.inv()

inline infix fun Byte.shl(bitCount: Int) = (this.toInt() shl bitCount).toByte()
inline infix fun Byte.shr(bitCount: Int) = (this.toInt() shr bitCount).toByte()
inline infix fun Byte.ushr(bitCount: Int) = (this.toInt() ushr bitCount).toByte()
inline infix fun Byte.and(other: Byte) = (this.toInt() and other.toInt()).toByte()
inline infix fun Byte.or(other: Byte) = (this.toInt() or other.toInt()).toByte()
inline infix fun Byte.xor(other: Byte) = (this.toInt() xor other.toInt()).toByte()
inline fun Byte.inv() = this.toInt().inv().toByte()
inline operator fun Byte.not() = this.inv()

inline infix fun Short.shl(bitCount: Int) = (this.toInt() shl bitCount).toShort()
inline infix fun Short.shr(bitCount: Int) = (this.toInt() shr bitCount).toShort()
inline infix fun Short.ushr(bitCount: Int) = (this.toInt() ushr bitCount).toShort()
inline infix fun Short.and(other: Short) = (this.toInt() and other.toInt()).toShort()
inline infix fun Short.or(other: Short) = (this.toInt() or other.toInt()).toShort()
inline infix fun Short.xor(other: Short) = (this.toInt() xor other.toInt()).toShort()
inline fun Short.inv() = this.toInt().inv().toShort()
inline operator fun Short.not() = this.inv()
