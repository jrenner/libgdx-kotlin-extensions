package org.jrenner.libgdx.kotlin

import com.badlogic.gdx.math.Quaternion

// Quaternion

fun Quaternion.times(q : Quaternion) : Quaternion {
    return this.mul(q)!!
}

fun Quaternion.times(f : Float) : Quaternion {
    return this.mul(f)!!
}

fun Quaternion.plus(q : Quaternion) : Quaternion {
    return this.add(q)!!
}

