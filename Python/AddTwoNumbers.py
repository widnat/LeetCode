from typing import Optional
from ListNode import ListNode, ListNodeHelper

class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = False
        returnNode = ListNode()
        node = returnNode
        while True :
            val = 1 if carry else 0
            carry = False
            if l1 != None and l2 != None :
                val += l1.val + l2.val
                if val > 9 :
                    val = val - 10
                    carry = True

                l1 = l1.next
                l2 = l2.next
            elif l1 != None :
                val += l1.val
                if val > 9 :
                    val = val - 10
                    carry = True

                l1 = l1.next
            elif l2 != None :
                val += l2.val
                if val > 9 :
                    val = val - 10
                    carry = True

                l2 = l2.next
            
            node.val = val
            val = 0
            if l1 == None and l2 == None :
                if (carry) :
                    node.next = ListNode(1)
                     
                return returnNode
            
            node.next = ListNode()
            node = node.next

solution = Solution();
node1 = ListNode(2, ListNode(4, ListNode(3)))
node2 = ListNode(5, ListNode(6, ListNode(4)))
resultNode = ListNode(7, ListNode(0, ListNode(8)))
listNodeHelper = ListNodeHelper()
assert listNodeHelper.compareTwoListNodes(solution.addTwoNumbers(node1, node2), resultNode)
