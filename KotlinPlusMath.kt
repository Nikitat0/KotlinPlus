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