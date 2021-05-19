package ru.nikitat.kotlinplus

@Suppress("UNCHECKED_CAST")
inline operator fun <reified T> Array<out T>.plus(second: Array<out T>): Array<out T> {
    val res = arrayOfNulls<T>(this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res as Array<out T>
}

inline operator fun ByteArray.plus(second: ByteArray): ByteArray {
    val res = bytes(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun ShortArray.plus(second: ShortArray): ShortArray {
    val res = shorts(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun IntArray.plus(second: IntArray): IntArray {
    val res = ints(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun LongArray.plus(second: LongArray): LongArray {
    val res = longs(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun FloatArray.plus(second: FloatArray): FloatArray {
    val res = floats(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun DoubleArray.plus(second: DoubleArray): DoubleArray {
    val res = doubles(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun CharArray.plus(second: CharArray): CharArray {
    val res = chars(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

inline operator fun BoolArray.plus(second: BoolArray): BoolArray {
    val res = bools(size = this.size + second.size)
    System.arraycopy(this, 0, res, 0, this.size)
    System.arraycopy(second, this.size, res, 0, second.size)
    return res
}

@Suppress("UNCHECKED_CAST")
inline fun <reified T> Array<out T>.subArray(from: Int = 0, to: Int = -1): Array<out T> {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res = arrayOfNulls<T>(len)
    System.arraycopy(this, from, res, 0, len)
    return res as Array<out T>
}

inline fun ByteArray.subArray(from: Int = 0, to: Int = -1): ByteArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: ByteArray = bytes(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun ShortArray.subArray(from: Int = 0, to: Int = -1): ShortArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: ShortArray = shorts(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun IntArray.subArray(from: Int = 0, to: Int = -1): IntArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: IntArray = ints(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun LongArray.subArray(from: Int = 0, to: Int = -1): LongArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: LongArray = longs(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun FloatArray.subArray(from: Int = 0, to: Int = -1): FloatArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: FloatArray = floats(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun DoubleArray.subArray(from: Int = 0, to: Int = -1): DoubleArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: DoubleArray = doubles(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun CharArray.subArray(from: Int = 0, to: Int = -1): CharArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: CharArray = chars(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

inline fun BoolArray.subArray(from: Int = 0, to: Int = -1): BoolArray {
    val to = if (to < 0) this.size + to else to
    val len = to - from
    val res: BoolArray = bools(size = len)
    System.arraycopy(this, from, res, 0, len)
    return res
}

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
