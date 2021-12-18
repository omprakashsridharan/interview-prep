package arraysandstrings

fun threeSumNaive(nums: IntArray): List<List<Int>> {
    var result = mutableListOf<List<Int>>()
    nums.forEachIndexed { index, it ->
        nums.forEachIndexed { index2, it2 ->
            if (index != index2) {
                nums.forEachIndexed { index3, it3 ->
                    if (index2 != index3 && index != index3) {
                        if (it + it2 + it3 == 0) {
                            val l = listOf(it, it2, it3)
                            if (!result.contains(l)) {
                                result.add(l)
                            }

                        }
                    }
                }
            }
        }
    }
    return result
}

fun threeSum(nums: IntArray): List<List<Int>> {
//    return threeSumNaive(nums)
    val res = mutableListOf<List<Int>>()
    val dups = mutableSetOf<Int>()
    val seen = mutableMapOf<Int, Int>()
    nums.forEachIndexed { i, val1 ->
        if (!dups.contains(val1)) {
            dups.add(val1)
            nums.slice(i+1 until nums.size).forEach {
                val complement = -val1 - it
                println("Com for $val1 and $it is $complement $seen")
                val l = listOf(val1, it, complement).sorted()
                if (seen.containsKey(complement) && seen[complement] == i && !res.contains(l)) {
                    println("Adding $l")
                    res.add(l)
                }
                seen[it] = i
            }
        }
    }
    return res
}

fun main() {
    val result = threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
    println("result ${result}")
}