package leetcode.medium.list_node

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    override fun toString(): String {
        var res = `val`.toString()
        var refList: ListNode? = next
        while (refList != null) {
            res = res + refList.`val`.toString()
            refList = refList.next
        }
        return res
    }
}