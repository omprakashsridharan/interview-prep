package tree

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun getLeafSequence(root: TreeNode?, l: MutableList<Int> = mutableListOf()){
    println("Val ${root?.`val`}")
    root?.let { ro ->
        ro.left?.let {
            getLeafSequence(it, l)
        }
    }
    root?.let { ro ->
        ro.right?.let {
            getLeafSequence(it, l)
        }
    }

    if (root?.left == null && root?.right == null){
        root?.`val`.let {
            if (it != null) {
                l.add(it)
            }
        }
    }
}

fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
    val l1 = mutableListOf<Int>()
    getLeafSequence(root1,l1)
    val l2 = mutableListOf<Int>()
    getLeafSequence(root2,l2)
    return l1 == l2
}

fun main(){
    println("Eq ${listOf<Int>(1,2) == listOf<Int>(1,2)}")
}