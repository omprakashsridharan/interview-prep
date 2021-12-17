package arraysandstrings

import kotlin.test.assertEquals
import kotlin.test.Test

internal class AtoiKtTest {
    @Test
    fun testEmptyString() {
        assertEquals(myAtoi(""), 0)
    }

    @Test
    fun testPositiveNumber() {
        assertEquals(myAtoi("+1"), 1)
    }

    @Test
    fun testStringStartingNumber() {
        assertEquals(myAtoi("abcd+1"), 0)
    }

    @Test
    fun testNumberFollowedByStringNumber() {
        assertEquals(myAtoi("1234abcd+1"), 1234)
    }

    @Test
    fun testDecimalNumber() {
        assertEquals(myAtoi("123.4abcd+1"), 123)
    }

    @Test
    fun testOverflowNumber() {
        assertEquals(myAtoi("1234542323322233"), 2147483647)
    }

    @Test
    fun testOverflowNegativeNumber() {
        assertEquals(myAtoi("-1234542323322233"), -2147483648)
    }

    @Test
    fun testLeadingWhitespaceNumber() {
        assertEquals(myAtoi("   23"), 23)
    }

    @Test
    fun testNegativeNumber() {
        assertEquals(myAtoi("   -23"), -23)
    }
}