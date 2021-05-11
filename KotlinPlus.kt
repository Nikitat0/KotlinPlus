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

inline fun wait(lambda: () -> Bool) {
    while (!lambda());
}

inline infix fun Int.times(action: (Int) -> Unit) {
    for (i in 0 until this) action(i)
}

inline operator fun Bool.dec() = !this
inline fun Bool.toByte(): Byte = if (this) 1 else 0
inline fun Bool.toShort(): Short = if (this) 1 else 0
inline fun Bool.toInt(): Int = if (this) 1 else 0
inline fun Bool.toLong(): Long = if (this) 1 else 0

inline fun sleep(time: Long) = Thread.sleep(time)
inline fun sleep(time: Long, nanos: Int) = Thread.sleep(time, nanos)
