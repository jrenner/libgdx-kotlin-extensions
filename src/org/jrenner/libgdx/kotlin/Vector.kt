package org.jrenner.libgdx.kotlin

import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.math.Vector3
import com.badlogic.gdx.math.Quaternion

// Vector2

fun Vector2.plus(v : Vector2) : Vector2 {
    return this.add(v)!!
}

fun Vector2.minus(v : Vector2) : Vector2 {
    return this.sub(v)!!
}

fun Vector2.times(v : Vector2) : Vector2 {
    return this.scl(v)!!
}

fun Vector2.times(f : Float) : Vector2 {
    return this.scl(f)!!
}

fun Vector2.div(v : Vector2) : Vector2 {
    this.x /= v.x
    this.y /= v.y
    return this
}

fun Vector2.div(f : Float) : Vector2 {
    this.x /= f
    this.y /= f
    return this
}

// Vector3

fun Vector3.plus(v : Vector3) : Vector3 {
    return this.add(v)!!
}

fun Vector3.minus(v : Vector3) : Vector3 {
    return this.sub(v)!!
}

fun Vector3.times(v : Vector3) : Vector3 {
    return this.scl(v)!!
}

fun Vector3.times(f : Float) : Vector3 {
    return this.scl(f)!!
}

fun Vector3.div(v : Vector3) : Vector3 {
    this.x /= v.x
    this.y /= v.y
    this.z /= v.z
    return this
}

fun Vector3.div(f : Float) : Vector3 {
    this.x /= f
    this.y /= f
    this.z /= f
    return this
}
