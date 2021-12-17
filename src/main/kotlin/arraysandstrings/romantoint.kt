package arraysandstrings

fun getCombinationValue(com: String): Int {
    return when (com) {
        "IV" -> 4
        "IX" -> 9
        "XL" -> 40
        "XC" -> 90
        "CD" -> 400
        "CM" -> 900
        else -> 0
    }
}

fun getValue(s: String): Int {
    return when (s) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }
}

fun romanToInt(s: String): Int {
    var sum = 0
    var previous = ""
    s.forEach {
        val cv = getCombinationValue("$previous$it")
        if (cv != 0) {
            sum += cv
            sum -= getValue(previous)
        } else {
            sum += getValue(it.toString())
        }
        previous = it.toString()
    }
    return sum
}

fun main() {
    val result = romanToInt("MCMXCIV")
    println("result $result")
}