package io.access.kotlintraining

/**
 * Created by Pu.Yue on 公元19-04-16.
 */
import java.util.Random

class Dice (private val n : Int) {

    var count : Int = 0
    fun roll() : String {
        if (count < 100) {
            val random = Random()
            val p = random.nextInt(n) // 0〜n までの範囲の値がランダムで返る
            count++
            return p.toString()
        } else {
            return "I was broken"
        }
    }

}
