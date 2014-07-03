package org.jrenner.libgdx.kotlin

import com.badlogic.gdx.utils.StringBuilder

fun StringBuilder.plus(obj : Any?) : StringBuilder {
    return this.append(obj.toString())!!
}