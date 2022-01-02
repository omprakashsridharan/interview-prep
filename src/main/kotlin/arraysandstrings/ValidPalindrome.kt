package arraysandstrings

fun isPalindrome(s: String): Boolean {
    val ss = s.toList().filter { it.isLetterOrDigit() }.map { it.lowercaseChar() }.joinToString("")
    var i = 0
    var j = ss.lastIndex
    while(i<=j){
        if(ss[i] != ss[j]) {
            return false
        }
        i += 1
        j -= 1
    }
    return true
}

fun main(){
    println("${isPalindrome("A man, a plan, a canal: Panama")}")
}