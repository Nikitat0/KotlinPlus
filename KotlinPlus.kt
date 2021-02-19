package ru.nikitat.kotlinplus

import java.util.concurrent.Callable

typealias Bool = Boolean
typealias BoolArray = BooleanArray

public inline operator fun Thread.invoke() = this.start()
public inline operator fun Runnable.invoke() = this.run()
public inline operator fun <reified V> Callable<V>.invoke(): V = this.call()

public inline fun forever(block: () -> Unit): Nothing {
    while (true) block()
}

public inline operator fun Int.invoke(action: (Int) -> Unit) {
    for (i in 0 until this) action(i)
}

public inline operator fun Bool.inc() = true
public inline operator fun Bool.dec() = false
public inline fun Bool.toByte() = this(1.toByte(), 0)
public inline fun Bool.toShort() = this(1.toShort(), 0)
public inline fun Bool.toInt() = this(1, 0)
public inline fun Bool.toLong() = this(1L, 0L)
