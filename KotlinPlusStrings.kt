package ru.kotlinplus

fun main() {
    "loh".edit{
        deleteCharAt(1)
        replace(0, 1, "hoho")
    }
}

inline fun String.edit(): StringBuilder {
    return StringBuilder(this)
}

inline fun String.edit(block: StringBuilder.() -> Unit): String {
    return StringBuilder(this).apply(block).toString()
}

inline fun String.edit(from: Int = 0, to: Int = -1, block: StringBuilder.() -> Unit): String {
    val to = if (to < 0) this.length + to else to
    replaceRange(from, to, substring(from, to).edit(block))
    return this
}

inline fun StringBuilder.edit(from: Int = 0, to: Int = -1, block: StringBuilder.() -> Unit) {
    val to = if (to < 0) this.length + to else to
    replace(from, to, substring(from, to).edit(block))
}

inline operator fun StringBuilder.invoke(block: StringBuilder.() -> Unit) {
    this.block()
}



inline operator fun StringBuilder.component1() = this.toString()

inline operator fun String.get(from: Int = 0, to: Int = -1): String {
    val to = if (to < 0) this.length + to else to
    return this.substring(from, to)
}

inline operator fun StringBuilder.get(from: Int = 0, to: Int = -1): String {
    val to = if (to < 0) this.length + to else to
    return this.substring(from, to)
}

inline fun StringBuilder.drop(index: Int) {
    deleteAt(index)
}