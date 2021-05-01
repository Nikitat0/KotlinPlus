package ru.nikitat.kotlinplus

import kotlin.math.abs
import kotlin.math.pow as kpow

inline infix fun Int.pow(v: Int): Int {
    var r = 1
    v times { r *= this }
    return r
}

inline infix fun Float.pow(v: Int) = this.kpow(v)
inline infix fun Float.pow(v: Float) = this.kpow(v)

inline infix fun Double.pow(v: Int) = this.kpow(v)
inline infix fun Double.pow(v: Double) = this.kpow(v)

val Int.abs
    inline get() = abs(this)
val Long.abs
    inline get() = abs(this)
val Float.abs
    inline get() = abs(this)
val Double.abs
    inline get() = abs(this)

fun Int.remap(from1: Int, to1: Int, from2: Int, to2: Int): Int = (this - from1) / (to1 - from1) * (to2 - from2) + from2
fun Int.constrain(min: Int, max: Int): Int =
    if (this > max) max else if (this < min) min else this