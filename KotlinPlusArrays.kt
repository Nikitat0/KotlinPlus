package ru.nikitat.kotlinplus

inline fun bytes(vararg varargs: Byte) = varargs
inline fun bytes(unit: Unit = Unit, size: Int) = ByteArray(size)
inline fun bytes(size: Int, init: (Int) -> Byte) = ByteArray(size) { init(it) }

inline fun shorts(vararg varargs: Short) = varargs
inline fun shorts(unit: Unit = Unit, size: Int) = ShortArray(size)
inline fun shorts(size: Int, init: (Int) -> Short) = ShortArray(size) { init(it) }

inline fun ints(vararg varargs: Int) = varargs
inline fun ints(unit: Unit = Unit, size: Int) = IntArray(size)
inline fun ints(size: Int, init: (Int) -> Int) = IntArray(size) { init(it) }

inline fun longs(vararg varargs: Long) = varargs
inline fun longs(unit: Unit = Unit, size: Int) = LongArray(size)
inline fun longs(size: Int, init: (Int) -> Long) = LongArray(size) { init(it) }

inline fun floats(vararg varargs: Float) = varargs
inline fun floats(unit: Unit = Unit, size: Int) = FloatArray(size)
inline fun floats(size: Int, init: (Int) -> Float) = FloatArray(size) { init(it) }

inline fun doubles(vararg varargs: Double) = varargs
inline fun doubles(unit: Unit = Unit, size: Int) = DoubleArray(size)
inline fun doubles(size: Int, init: (Int) -> Double) = DoubleArray(size) { init(it) }

inline fun chars(vararg varargs: Char) = varargs
inline fun chars(unit: Unit = Unit, size: Int) = CharArray(size)
inline fun chars(size: Int, init: (Int) -> Char) = CharArray(size) { init(it) }

inline fun bools(vararg varargs: Bool) = varargs
inline fun bools(unit: Unit = Unit, size: Int) = BoolArray(size)
inline fun bools(size: Int, init: (Int) -> Bool) = BoolArray(size) { init(it) }

inline fun <reified V> array(vararg varargs: V) = varargs
inline fun <reified V> array(unit: Unit = Unit, size: Int = 0) = Array<V?>(size) { null }
inline fun <reified V> array(size: Int, init: (Int) -> V) = Array<V>(size) { init(it) }
