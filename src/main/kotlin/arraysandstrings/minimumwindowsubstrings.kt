package arraysandstrings

data class Window(var ans: Int = Int.MAX_VALUE, var left: Int = 0, var right: Int = 0)

fun minWindow(s: String, t: String): String {
    if (t.isEmpty() || s.isEmpty()) {
        return ""
    }
    val result = Window()
    var l = 0
    var r = 0

    val tCountMap = t.split("").filter { it.isNotEmpty() }.groupingBy { it.first() }.eachCount()
    val currentWindowCountMap = mutableMapOf<Char, Int>()
    var currentUniqueCharactersCount = 0

    while (r < s.length) {
        val c = s[r]
        currentWindowCountMap[c] = currentWindowCountMap.getOrDefault(c, 0) + 1
        if (c in tCountMap && currentWindowCountMap[c] == tCountMap[c]) {
            currentUniqueCharactersCount += 1
        }
        while (l <= r && currentUniqueCharactersCount == tCountMap.size) {
            val innerC = s[l]
            if (r - l + 1 < result.ans) {
                result.ans = r - l + 1
                result.left = l
                result.right = r
            }
            currentWindowCountMap[innerC] = currentWindowCountMap.getOrDefault(innerC, 1) - 1
            if ((innerC in tCountMap) && (innerC in currentWindowCountMap) && currentWindowCountMap[innerC]!! < tCountMap[innerC]!!) {
                currentUniqueCharactersCount -= 1
            }
            l += 1
        }
        r += 1
    }

    return if(result.ans == Int.MAX_VALUE){
        ""
    }else{
        s.substring(result.left..result.right)
    }
}

fun main() {
    val result = minWindow("ADOBECODEBANC", "ABC")
    println("Result $result")
}