package ru.nikitat.kotlinplus

inline operator fun Bool.invoke(block: () -> Unit) = this.apply { if (this) block() }
inline operator fun Bool.minus(block: () -> Unit) = this.apply { if (!this) block() }
inline infix fun Bool.orElse(block: () -> Unit) = this.apply { if (!this) block() }

inline operator fun <reified V> Bool.invoke(v: V, v2: V) = if (this) v else v2
inline operator fun Bool.invoke(v: Byte, v2: Byte) = if (this) v else v2
inline operator fun Bool.invoke(v: Short, v2: Short) = if (this) v else v2
inline operator fun Bool.invoke(v: Int, v2: Int) = if (this) v else v2
inline operator fun Bool.invoke(v: Long, v2: Long) = if (this) v else v2
inline operator fun Bool.invoke(v: Float, v2: Float) = if (this) v else v2
inline operator fun Bool.invoke(v: Double, v2: Double) = if (this) v else v2
inline operator fun Bool.invoke(v: Char, v2: Char) = if (this) v else v2
inline operator fun Bool.invoke(v: Bool, v2: Bool) = if (this) v else v2
