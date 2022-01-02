package arraysandstrings

fun productExceptSelf(nums: IntArray): IntArray {
    val n = nums.size
    if(n == 1){
        return IntArray(1)
    }
    var temp = 1
    val prod = IntArray(n)
    for(j in 0 until n){
        prod[j] = 1
    }
    for(i in 0 until n){
        prod[i] = temp
        temp *= nums[i]
    }
    temp = 1
    for(i in (n-1) downTo 0){
        prod[i] *= temp
        temp *= nums[i]
    }
    return prod
}

fun main(){
    println("result ${productExceptSelf(intArrayOf(1,2,3,4)).contentToString()}")
}