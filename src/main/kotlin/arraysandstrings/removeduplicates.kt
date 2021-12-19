package arraysandstrings

fun removeDuplicates(nums: IntArray): Int {
    var swapIndex = 0
    nums.forEachIndexed { index, value ->
        if(nums[swapIndex] != value){
            swapIndex += 1
            val temp = nums[swapIndex]
            nums[swapIndex] = nums[index]
            nums[index] = temp
        }
    }
    return swapIndex + 1
}

fun main(){
    val arr = intArrayOf(0,0,1,1,1,2,2,3,3,4)
    val result = removeDuplicates(arr)
    println("arr ${arr.contentToString()}")
    println("result $result")
}