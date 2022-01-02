package arraysandstrings


fun maxSubArray(nums: IntArray): Int {
    var max = Integer.MIN_VALUE
    var sum = 0
    for (i in 0 until nums.size) {
        sum += nums[i]
        max = sum.coerceAtLeast(max)
        if (sum < 0) sum = 0
    }
    return max
}

fun main(){
    println("${maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))}")
}