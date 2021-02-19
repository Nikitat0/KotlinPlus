package ru.nikitat.kotlinplus

object bytes {
    public inline operator fun get(vararg varargs: Byte) = varargs
    public inline operator fun invoke(size: Int) = ByteArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Byte) = ByteArray(size) { init(it) }
}

object shorts {
    public inline operator fun get(vararg varargs: Short) = varargs
    public inline operator fun invoke(size: Int) = ShortArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Short) = ShortArray(size) { init(it) }
}

object ints {
    public inline operator fun get(vararg varargs: Int) = varargs
    public inline operator fun invoke(size: Int) = IntArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Int) = IntArray(size) { init(it) }
}

object longs {
    public inline operator fun get(vararg varargs: Long) = varargs
    public inline operator fun invoke(size: Int) = LongArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Long) = LongArray(size) { init(it) }
}

object floats {
    public inline operator fun get(vararg varargs: Float) = varargs
    public inline operator fun invoke(size: Int) = FloatArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Float) = FloatArray(size) { init(it) }
}

object doubles {
    public inline operator fun get(vararg varargs: Double) = varargs
    public inline operator fun invoke(size: Int) = DoubleArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Double) = DoubleArray(size) { init(it) }
}

object chars {
    public inline operator fun get(vararg varargs: Char) = varargs
    public inline operator fun invoke(size: Int) = CharArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Char) = CharArray(size) { init(it) }
}

object bools {
    public inline operator fun get(vararg varargs: Bool) = varargs
    public inline operator fun invoke(size: Int) = BoolArray(size)
    public inline operator fun invoke(size: Int, init: (Int) -> Bool) = BoolArray(size) { init(it) }
}

object new {
    public inline operator fun <reified V> get(vararg varargs: V) = varargs
    public inline operator fun <reified V> invoke(vararg varargs: V) = varargs
    public inline operator fun <reified V> invoke(size: Int, init: (Int) -> V) = Array<V>(size) { init(it) }
}