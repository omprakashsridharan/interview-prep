package arraysandstrings

fun getSum(s: String): Int {
    return when (s) {
        "000" -> 0
        "001" -> 1
        "010" -> 1
        "011" -> 10
        "100" -> 1
        "101" -> 10
        "110" -> 10
        "111" -> 11
        "00" -> 0
        "01" -> 1
        "10" -> 1
        "11" -> 10
        else -> 0
    }
}

fun addBinary(a: String, b: String): String {
    var result = ""
    val bn: String
    val sn: String
    var bi: Int
    var si: Int
    if (a.length > b.length) {
        bn = a
        sn = b
        bi = a.lastIndex
        si = b.lastIndex
    } else {
        bn = b
        sn = a
        bi = b.lastIndex
        si = a.lastIndex
    }
    var remainder = 0
    while (si >= 0) {
        val sum = getSum("${remainder}${bn[bi]}${sn[si]}")
        val rem = sum % 10
        val quo = sum / 10
        result = rem.toString() + result
        remainder = if (quo > 0) {
            quo
        } else {
            0
        }
        bi--
        si--
    }
    while (bi >= 0) {
        val sum = getSum("${remainder}${bn[bi]}")
        val rem = sum % 10
        val quo = sum / 10
        result = rem.toString() + result
        remainder = if (quo > 0) {
            quo
        } else {
            0
        }
        bi--
    }
    if (remainder > 0) {
        result = remainder.toString() + result
    }
    return result
}

fun main() {
    println("result ${addBinary("100", "110010")}")
}