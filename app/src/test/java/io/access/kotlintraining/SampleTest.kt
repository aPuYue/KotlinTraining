package io.access.kotlintraining

import org.junit.Test
import java.util.*
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

    @Test
    fun TestFizzBuzz() {

        fizzBuzz()

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