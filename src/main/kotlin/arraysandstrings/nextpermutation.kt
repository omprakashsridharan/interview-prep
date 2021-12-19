package arraysandstrings

fun swap(nums: IntArray, i: Int, j: Int) {
    val temp = nums[i]
    nums[i] = nums[j]
    nums[j] = temp
}
fun reverse(nums: IntArray, s: Int) {
    var i = s
    var j = nums.lastIndex
    while(i < j) {
        swap(nums, i, j)
        i++
        j--
    }
}

fun nextPermutation(nums: IntArray) {
    var i = nums.lastIndex - 1
    while( i >= 0 && nums[i+1] <= nums[i]) {
        i--
    }
    if(i >= 0){
        var j = nums.lastIndex
        while(nums[i] >= nums[j]) j--
        swap(nums,i,j)
    }
    reverse(nums,i+1)
}

fun main(){
    val nums = intArrayOf(2,3,1)
    nextPermutation(nums)
    println("result ${nums.contentToString()}")
}