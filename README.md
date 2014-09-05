libgdx-kotlin-extensions
========================

Kotlin Extension Methods for LibGDX



##Purpose
For users of Kotlin + LibGDX, this repo contains convenient operator overloads for following classes:
* Vector2
* Vector3
* Quaternion
* Matrix3
* Matrix4
* StringBuilder (com.badlogic.gdx.utils.StringBuilder)

###Examples:
```kotlin
// Vector2
val v1 = Vector2(1f, 0f)
val v2 = Vector2(1f, 1f)
v1 + v2 // v1 value is now 2f, 1f
v1 * 4f // v1 value is now8f, 4f

// Vector3
val myPos = Vector3(100f, 0f, 0f)
val enemyPos : Vector3(50f, 0f, 0f)
val difference = Vector3(enemyPos) - myPos // difference refers to myPos, which has value (-50f, 0f, 0f)

// StringBuilder

val sb = StringBuilder()
sb + "Hello" + " World" + ", How" + " are" + " you?"
sb.toString() // "Hello World, How are you?"
```
