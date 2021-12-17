package arraysandstrings

import kotlin.test.assertEquals
import kotlin.test.Test

internal class RomantointKtTest {

    @Test
    fun testRomanToInt() {
        assertEquals(romanToInt("IV"), 4)
        assertEquals(romanToInt("IX"), 9)
        assertEquals(romanToInt("XL"), 40)
        assertEquals(romanToInt("XC"), 90)
        assertEquals(romanToInt("CD"), 400)
        assertEquals(romanToInt("CM"), 900)
        assertEquals(romanToInt("V"), 5)
        assertEquals(romanToInt("MCMXCIV"), 1994)
        assertEquals(romanToInt("L"), 50)
        assertEquals(romanToInt("D"), 500)
        assertEquals(romanToInt("O"), 0)
    }
}