package arraysandstrings

fun addNumberStrings(num1: String, num2: String): String {
    if (num1 == "") return num2
    if (num2 == "") return num1
    var sum = ""
    var remainder = 0
    var i1 = num1.lastIndex
    var i2 = num2.lastIndex
    while (i1 >= 0 && i2 >= 0) {
        val s = (num1[i1].digitToInt() + num2[i2].digitToInt()) + remainder
        val rem = s % 10
        val quo = s / 10
        sum = rem.toString() + sum
        remainder = if (quo > 0) {
            quo
        } else {
            0
        }
        i1--
        i2--
    }
    while (i1 >= 0) {
        val s = num1[i1].digitToInt() + remainder
        val rem = s % 10
        val quo = s / 10
        sum = rem.toString() + sum
        remainder = if (quo > 0) {
            quo
        } else {
            0
        }
        i1--
    }
    while (i2 >= 0) {
        val s = num2[i2].digitToInt() + remainder
        val rem = s % 10
        val quo = s / 10
        sum = rem.toString() + sum
        remainder = if (quo > 0) {
            quo
        } else {
            0
        }
        i2--
    }
    if (remainder > 0) {
        sum = remainder.toString() + sum
    }
    return sum
}

fun multiply(num1: String, num2: String): String {
    if (num1 == "0" || num2 == "0") return "0"
    var result = ""
    val bn: String
    val sn: String
    if (num1.length >= num2.length) {
        bn = num1
        sn = num2
    } else {
        bn = num2
        sn = num1
    }
    sn.reversed().forEachIndexed { index, it ->
        var rowSum = ""
        var remainder = 0
        bn.reversed().forEach { it2 ->
            val sum = (it.digitToInt() * it2.digitToInt()) + remainder
            val rem = sum % 10
            val quo = sum / 10
            rowSum = rem.toString() + rowSum
            remainder = if (quo > 0) {
                quo
            } else {
                0
            }
        }
        if (remainder > 0) {
            rowSum = remainder.toString() + rowSum
        }
        var i = index
        while (i > 0) {
            rowSum += "0"
            i--
        }
        result = addNumberStrings(result,rowSum)
    }
    return result
}

fun main() {
    val result = multiply("2", "3")
    println("result $result")
}