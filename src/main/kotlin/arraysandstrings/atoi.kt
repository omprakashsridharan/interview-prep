package arraysandstrings

import java.math.BigInteger
import kotlin.math.pow

fun myAtoi(s: String): Int {
    var sanitisedInput = s.trim()
    var sum: BigInteger = BigInteger("0")
    var multiplier = 1

    if(sanitisedInput.startsWith("-")){
        multiplier = -1
        sanitisedInput = sanitisedInput.removePrefix("-")
    }else if(sanitisedInput.startsWith("+")){
        sanitisedInput = sanitisedInput.removePrefix("+")
    }
    if(sanitisedInput.isEmpty() || !sanitisedInput[0].isDigit()){
        return 0
    }
    for(c in sanitisedInput){
        if(c.isDigit()){
            sum = sum.times(BigInteger("10")).add(BigInteger(c.toString()))
        }else{
            break
        }
//        println(sum)
    }
    val twoPower = (2.0).pow(31)
    val maxInt = (twoPower - 1.0).toInt()
    val minInt = (twoPower * -1).toInt()
    val result = sum.times(BigInteger(multiplier.toString()))
    if(result.compareTo(BigInteger(maxInt.toString())) == 1) {
        return maxInt
    }
    if(result.compareTo(BigInteger(minInt.toString())) == -1){
        return minInt
    }
    return result.toInt()
}

fun main(){
    val result = myAtoi("-+13+8")
    println("result $result")
}