package arraysandstrings

fun flipAndInvertImage(image: Array<IntArray>): Array<IntArray> {
    if(image.isEmpty()) return arrayOf()
    val n = image[0].size
    val result = Array(n) {
        IntArray(n) {
            0
        }
    }
    image.forEachIndexed { row, it ->
        it.forEachIndexed { col, sit ->
            result[row][n - col - 1] = if(sit == 1) 0 else 1
        }
    }
    return result
}

fun main(){
    val matrix = arrayOf(intArrayOf(1,1,0,0), intArrayOf(1,0,0,1), intArrayOf(0,1,1,1), intArrayOf(1,0,1,0))
    println("Result is ${flipAndInvertImage(matrix).forEach { println(it.contentToString()) }}")
}