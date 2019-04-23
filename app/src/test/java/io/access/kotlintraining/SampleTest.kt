package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {
    @Test
    fun testWelcome() {
        welcome()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    //Fizz Buzz
    @Test
    fun main() {
        fizzBuzz()
    }

    //うるう年
    @Test
    fun main1() {
        isLeapYear(2013)
    }

    //累乗
    @Test
    fun main2() {
        power(2, 10)
    }

    //奇数か偶数か
    @Test
    fun main3() {
        val a = -5
        a.isOdd() // true
        a.isEven() // false
    }

    //Dice
    @Test
    fun main4() {
        doDice()
    }

    //doCount
    @Test
    fun main5() {
        doCount()
    }

    //doNext
    @Test
    fun main6() {
        doNext()
    }


    //ここは代入値がないので、bulidができたら問題ないです。
    @Test
    fun main7() {
//        sendMessageToClient()
    }


}