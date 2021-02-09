package ru.nikitat

import java.util.concurrent.Callable

inline operator fun Thread.invoke() = this.start()
inline operator fun Runnable.invoke() = this.run()
inline operator fun <V> Callable<V>.invoke() = this.call()

