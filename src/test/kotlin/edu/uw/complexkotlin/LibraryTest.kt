/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package edu.uw.complexkotlin

import kotlin.test.*

class LibraryTest {
    @Test fun fizzbuzzToTwo() {
        assertEquals("", fizzbuzz(1..2))
    }
    @Test fun fizzbuzzToThree() {
        assertEquals("FIZZ", fizzbuzz(1..3))
    }
    @Test fun fizzbuzzToSix() {
        assertEquals("FIZZBUZZFIZZ", fizzbuzz(1..6))
    }
    @Test fun fizzbuzzToTwelve() {
        assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZ", fizzbuzz(1..12))
    }
    @Test fun fizzbuzzToFifteen() {
        assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZ", fizzbuzz(1..15))
    }
    // Fizzbuzz to 25 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZ"
    @Test fun fizzbuzzToTwentyFive() {
        assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZ", fizzbuzz(1..25))
    }
    // Fizzbuzz to 50 should equal "FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZ"
    @Test fun fizzbuzzToFifty() {
        assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZ", fizzbuzz(1..50))
    }
    @Test fun fizzbuzzToHundred() {
        assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZFIZZBUZZFIZZFIZZBUZZ", fizzbuzz(1..100))
    }

    // Doh Tests
    @Test fun dohToTwentyEight() {
        assertEquals("DOH!DOH!DOH!DOH!", doh(1..28))
    }

    @Test fun dohToFifteen() {
        assertEquals("DOH!DOH!", doh(1..15))
    }

    @Test fun dohToSeventy() {
        assertEquals("DOH!DOH!DOH!DOH!DOH!DOH!DOH!DOH!DOH!DOH!", doh(1..70))
    }

    // Fizzbuzzgen Tests
    @Test fun fizzbuzzgenToFifteen() {
       val fb = fizzbuzzgen(mapOf(3 to "FIZZ", 5 to "BUZZ"))
       assertEquals("FIZZBUZZFIZZFIZZBUZZFIZZFIZZBUZZ", fb(1..15))
    }

    @Test fun fizzbuzzgenToTwenty() {
        val fb = fizzbuzzgen(mapOf(4 to "FOUR", 5 to "FIVE"))
        assertEquals("FOURFIVEFOURFIVEFOURFIVEFOURFOURFIVE", fb(1..20))
    }

    @Test fun fizzbuzzgenToThirty() {
        val fb = fizzbuzzgen(mapOf(3 to "FIZZ", 10 to "BUZZ"))
        assertEquals("FIZZFIZZFIZZBUZZFIZZFIZZFIZZBUZZFIZZFIZZFIZZFIZZBUZZ", fb(1..30))
    }

    @Test fun r1Test() {
        assertEquals(">>> FOO: {BAR}", r1())
    }
    @Test fun r2Test() {
        assertEquals(">>> FOO: {WOOGAWOOGAWOOGA}", r2())
    }

    @Test fun philosopherTests() {
        var seneca = Philosopher.THINKING
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())

        // Shift to thinking
        seneca = seneca.signal()
        assertEquals("Deep thoughts....", seneca.toString())

        // Shift back to talking
        seneca = seneca.signal()
        assertEquals("Allow me to suggest an idea...", seneca.toString())
    }

    @Test fun commandTests() {
        assertEquals("", Command("")(""))
        assertEquals("> Hello!", Command("> ")("Hello!"))
    }
}
