package arraysandstrings

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String,MutableList<String>>()
    strs.forEach { it ->
        val s = it.toCharArray().sorted().joinToString("")
        val l = map.getOrDefault(s, mutableListOf())
        l.add(it)
        map[s] = l
    }
    return map.values.toList()
}

fun main(){

    println("result ${groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))}")
}