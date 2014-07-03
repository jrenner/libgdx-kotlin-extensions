libgdx-kotlin-extensions
========================

Kotlin Extension Methods for LibGDX



##Purpose
This repo contains the source code for convenient extensions methods for any developer using Kotlin to develop LibGDX games and applications.

###Example:
```kotlin
val v1 = Vector2(1f, 0f)
val v2 = Vector2(1f, 1f)
v1 + v2
// results in: v1 = (2f, 1f), v2 = (1f, 1f)

val myPos : Vector3
val enemyPos : Vector3

val difference = Vector3(enemyPos) - myPos
// all three vectors have unique values
```
