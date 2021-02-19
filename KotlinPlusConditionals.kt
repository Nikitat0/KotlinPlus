package ru.nikitat.kotlinplus

public inline operator fun Bool.invoke(block: () -> Unit) = run { if (this) block() }
public inline operator fun Bool.minus(block: () -> Unit) = run { if (!this) block() }
public inline operator fun Bool.invoke(block: () -> Unit, block2: () -> Unit) = if (this) block() else block2()

public inline operator fun <reified V> Bool.invoke(v: V, v2: V) = if (this) v else v2
public inline operator fun Bool.invoke(v: Byte, v2: Byte) = if (this) v else v2
public inline operator fun Bool.invoke(v: Short, v2: Short) = if (this) v else v2
public inline operator fun Bool.invoke(v: Int, v2: Int) = if (this) v else v2
public inline operator fun Bool.invoke(v: Long, v2: Long) = if (this) v else v2
public inline operator fun Bool.invoke(v: Float, v2: Float) = if (this) v else v2
public inline operator fun Bool.invoke(v: Double, v2: Double) = if (this) v else v2
public inline operator fun Bool.invoke(v: Char, v2: Char) = if (this) v else v2
public inline operator fun Bool.invoke(v: Bool, v2: Bool) = if (this) v else v2
