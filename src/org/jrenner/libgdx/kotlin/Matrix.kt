package org.jrenner.libgdx.kotlin

import com.badlogic.gdx.math.Matrix3
import com.badlogic.gdx.math.Matrix4

// Matrix3

fun Matrix3.times(m : Matrix3) : Matrix3 {
    return this.mul(m)!!
}

// Matrix4

fun Matrix4.times(m : Matrix4) : Matrix4 {
    return this.mul(m)!!
}
