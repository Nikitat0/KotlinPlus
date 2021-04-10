package ru.nikitat.kotlinplus

object bytes {
    inline operator fun get(vararg varargs: Byte) = varargs
    inline operator fun invoke(size: Int) = ByteArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Byte) = ByteArray(size) { init(it) }
}

object shorts {
    inline operator fun get(vararg varargs: Short) = varargs
    inline operator fun invoke(size: Int) = ShortArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Short) = ShortArray(size) { init(it) }
}

object ints {
    inline operator fun get(vararg varargs: Int) = varargs
    inline operator fun invoke(size: Int) = IntArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Int) = IntArray(size) { init(it) }
}

object longs {
    inline operator fun get(vararg varargs: Long) = varargs
    inline operator fun invoke(size: Int) = LongArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Long) = LongArray(size) { init(it) }
}

object floats {
    inline operator fun get(vararg varargs: Float) = varargs
    inline operator fun invoke(size: Int) = FloatArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Float) = FloatArray(size) { init(it) }
}

object doubles {
    inline operator fun get(vararg varargs: Double) = varargs
    inline operator fun invoke(size: Int) = DoubleArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Double) = DoubleArray(size) { init(it) }
}

object chars {
    inline operator fun get(vararg varargs: Char) = varargs
    inline operator fun invoke(size: Int) = CharArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Char) = CharArray(size) { init(it) }
}

object bools {
    inline operator fun get(vararg varargs: Bool) = varargs
    inline operator fun invoke(size: Int) = BoolArray(size)
    inline operator fun invoke(size: Int, init: (Int) -> Bool) = BoolArray(size) { init(it) }
}

object new {
    inline operator fun <reified V> get(vararg varargs: V) = varargs
    inline operator fun <reified V> invoke(vararg varargs: V) = varargs
    inline operator fun <reified V> invoke(size: Int, init: (Int) -> V) = Array<V>(size) { init(it) }
}