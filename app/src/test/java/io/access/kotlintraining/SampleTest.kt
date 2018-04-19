package io.access.kotlintraining

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertSame

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

    @Test
    fun TestFizzBuzz() {

        fizzBuzz()

    }

    @Test
    fun TestFizzBuzz2() {

        var t=10
        fizzBuzz2(t)



    }



    @Test
    fun TestLeapYear() {

        if (isLeapYear(2010))

        println("うるう年です")

        else

        println("うるう年です")

    }

    @Test
    fun Testpower(){

        println( power(12.3,56.3))

    }



}
    @Test
    fun main() {
        val a = 5
        assertEquals(a.isOdd(),actual = true)  // true

        assertEquals(a.isEven(),actual = false) // false

    }
