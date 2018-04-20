package io.access.kotlintraining

import java.util.*

/**
 * Created by ${puyue} on 2018/4/20.
 */

/**
 * 奇数か偶数か
 */
fun power(a: Double, n: Double): Double {
    if (a < 0 || n < 0) {
        println("inputs must be positive. return 0")
        return 0.toDouble()
    }
    // TODO: 実装する

    else
        return a*n//.toLong()
}

fun Int.isOdd() = this%2 != 0


fun Int.isEven()= this%2 == 0


/**
 * n 面のサイコロ
 */
class Dice(num:Int){
    var num :Int=100
    var con :Int=0
    fun roll(){

        if ( con<=100 && con>=1 ){
            val random = Random()
            val n = random.nextInt(num) // 0〜99 までの範囲の値がランダムで返る
            println(n)
        }
        else
            println("I was broken")

        con++
    }

}

/**
 * 世界のナベアツ
 */
class NabeAtsu {
    private var con: Int=0
    fun next(): String {
        con++
        if (con%3==0 || con.toString().contains("3")){

            return "Aho"
        }
        else
        {
            return con.toString()
        }
    }

}