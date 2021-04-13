package ru.nikitat.kotlinplus

import java.util.concurrent.Callable

typealias Bool = Boolean
typealias BoolArray = BooleanArray

inline operator fun Thread.invoke() = this.start()
inline operator fun Runnable.invoke() = this.run()
inline operator fun <reified V> Callable<V>.invoke(): V = this.call()

inline fun forever(block: () -> Unit): Nothing {
    while (true) block()
}

inline fun wait(lambda: () -> Bool) = run { while (!lambda()); }

inline operator fun Int.invoke(action: (Int) -> Unit) {
    for (i in 0 until this) action(i)
}

inline operator fun Bool.inc() = true
inline operator fun Bool.dec() = false
inline fun Bool.toByte() = this(1.toByte(), 0)
inline fun Bool.toShort() = this(1.toShort(), 0)
inline fun Bool.toInt() = this(1, 0)
inline fun Bool.toLong() = this(1L, 0L)
