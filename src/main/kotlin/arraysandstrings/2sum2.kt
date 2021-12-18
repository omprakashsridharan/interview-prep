package arraysandstrings

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()
    numbers.forEachIndexed { index, it ->
        val complement = target - it
        if (map.containsKey(complement)) {
            map[complement]?.let { it1 -> result.add(it1) }
            result.add(index + 1)
            return result.toIntArray()
        }
        map[it] = index + 1
    }
    return result.toIntArray()
}

fun main() {
    val result = twoSum(intArrayOf(2, 7, 11, 15), 9)

    println("result ${result.contentToString()}")
}