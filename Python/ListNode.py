
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class ListNodeHelper:
    def compareTwoListNodes(self, node1, node2) :
        if node1 == None or node2 == None or node1.val != node2.val :
            return False
        
        if node1.next != None and node2.next != None :
            return self.compareTwoListNodes(node1.next, node2.next)
        
        if node1.next == None and node2.next == None :
            return True