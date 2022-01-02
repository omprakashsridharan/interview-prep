package arraysandstrings

fun twoSum(numbers: IntArray, target: Int): IntArray {
    val m = mutableMapOf<Int, Int>()
    val result = mutableListOf<Int>()
    numbers.forEachIndexed { index, it ->
        val complement = target - it
        m[complement]?.let { v ->
            result.add(v)
            result.add(index)
            return result.toIntArray()
        }
        m[it] = index
    }
    return result.toIntArray()
}

fun main() {
    println("result ${twoSum(intArrayOf(3,1,4), 6).contentToString()}")
}