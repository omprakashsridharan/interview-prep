package arraysandstrings

fun maxProfit(prices: IntArray): Int {
    var maxProfit = -1
    var min = 0
    var max = 0
    prices.forEachIndexed { index,it ->
        if(it <= prices[min]){
            min = index
            max = index
        }
        if(it > prices[max]){
            max = index
        }
        maxProfit = Math.max((prices[max] - prices[min]),maxProfit)
    }
    return maxProfit
}

fun main(){
    println("Result ${maxProfit(intArrayOf(7,6,4,3,1))}")
}