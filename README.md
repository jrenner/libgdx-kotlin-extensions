libgdx-kotlin-extensions
========================

Kotlin Extension Methods for LibGDX



##Purpose
This repo contains the source code for convenient extensions methods for any developer using Kotlin to develop LibGDX games and applications.

###Example:
```kotlin
// Vector2
val v1 = Vector2(1f, 0f)
val v2 = Vector2(1f, 1f)
v1 + v2
println(v1) // 2f, 1f

// Vector3
val myPos = Vector3(100f, 0f, 0f)
val enemyPos : Vector3(50f, 0f, 0f)
val difference = Vector3(enemyPos) - myPos
println(difference) // (-50f, 0f, 0f)

// there are also methods for Quaternion, Matrix3 and Matrix4
```
