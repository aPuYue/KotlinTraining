package io.access.kotlintraining

/**
 * Created by Pu.Yue on 公元19-04-16.
 */
class NabeAtsu {
    var c = 1

    fun next(): String {
        if (c%3 ==0 || c/10 == 3 || c%10 ==3) {
            c++
            return  "Aho"
        } else {
            c++
            return (c-1).toString()
        }
    }
}