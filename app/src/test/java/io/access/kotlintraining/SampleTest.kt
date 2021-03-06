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

    @Test
    fun testHello() {
        // TODO: implement to call hello function
        hello()
    }


    /**
     * fizzbuzz
     */
    @Test
    fun TestFizzBuzz() {

        fizzBuzz()

    }

    @Test
    fun TestFizzBuzz2() {

        var t=10
        fizzBuzz2(t)



    }

    /**
     * うるう年
     */
    @Test
    fun TestLeapYear() {

        if (isLeapYear(2010))

        println("うるう年です")

        else

        println("うるう年です")

    }

    /**
     * 奇数か偶数か
     */
    @Test
    fun Testpower(){

        println( power(12.3,56.3))

    }


    @Test
    fun Number() {
        val a = 5
        assertEquals(a.isOdd(),actual = true)  // true

        assertEquals(a.isEven(),actual = false) // false

    }

    /**
     * n 面のサイコロ
     */
    @Test
    fun UseDice(){
        val d = Dice(55)
        for (i in 1..100) {
            println(d.roll()) // 1〜16 までの数字
        }
        println(d.roll()) // Exception
    }

    /**
     * 世界のナベアツ
     */
    @Test
    fun UseNabeAtsu() {
        val n = NabeAtsu()
        for (i in 1..100) {
            println(n.next())
        }
    }

    /**
     * ヌルとの戦い
     */
    @Test
    fun Use(){

        val p = PersonalInfo("puyue2016@gmail.com")
        val c =Client (p)
        val mc=MailerClass()

        sendMessageToClient(c,"1234567890",mc)

    }




}



