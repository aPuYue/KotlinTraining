package io.access.kotlintraining

/**
 * Created by Pu.Yue on 公元19-04-16.
 */

class MyCustomClass {

    var counter: Int = 0
    var old: Int = 0

    var propertyWithCounter: Int = 0
        set(propertyWithCounter) =
            if (propertyWithCounter != old) {
                old = propertyWithCounter
                counter++

            }
}