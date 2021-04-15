package ru.nikitat.kotlinplus

import it.unimi.dsi.fastutil.booleans.BooleanArrayList
import it.unimi.dsi.fastutil.bytes.ByteArrayList
import it.unimi.dsi.fastutil.chars.CharArrayList
import it.unimi.dsi.fastutil.doubles.DoubleArrayList
import it.unimi.dsi.fastutil.floats.FloatArrayList
import it.unimi.dsi.fastutil.ints.IntArrayList
import it.unimi.dsi.fastutil.longs.LongArrayList
import it.unimi.dsi.fastutil.objects.ObjectArrayList
import it.unimi.dsi.fastutil.objects.ObjectImmutableList
import it.unimi.dsi.fastutil.shorts.ShortArrayList

typealias ByteList = ByteArrayList
typealias ShortList = ShortArrayList
typealias IntList = IntArrayList
typealias LongList = LongArrayList
typealias FloatList = FloatArrayList
typealias DoubleList = DoubleArrayList
typealias CharList = CharArrayList
typealias BoolList = BooleanArrayList

typealias byteList = ByteArrayList
typealias shortList = ShortArrayList
typealias intList = IntArrayList
typealias longList = LongArrayList
typealias floatList = FloatArrayList
typealias doubleList = DoubleArrayList
typealias charList = CharArrayList
typealias boolList = BooleanArrayList

typealias ArrayList<V> = ObjectArrayList<V>
typealias ImmutableList<V> = ObjectImmutableList<V>

inline fun <reified V> list(vararg varargs: V) = ObjectArrayList<V>(varargs)
inline fun <reified V> list(capacity: Int) = ObjectArrayList<V>(capacity)
inline fun <reified V> list(vararg varargs: V, immutable: Bool) =
    if (immutable) ObjectImmutableList<V>(varargs) else ObjectArrayList<V>(varargs)

inline fun <reified V> list(size: Int, init: (Int) -> V) = ObjectArrayList(array(size, init))
