package ru.nikitat.kotlinplus

import kotlin.math.abs
import kotlin.math.pow as kpow

public inline infix fun Int.pow(v: Int): Int {
    var r = 1
    v { r *= this }
    return r
}

public inline infix fun Float.pow(v: Int) = this.kpow(v)
public inline infix fun Float.pow(v: Float) = this.kpow(v)

public inline infix fun Double.pow(v: Int) = this.kpow(v)
public inline infix fun Double.pow(v: Double) = this.kpow(v)

val Int.abs
    public inline get() = abs(this)
val Long.abs
    public inline get() = abs(this)
val Float.abs
    public inline get() = abs(this)
val Double.abs
    public inline get() = abs(this)