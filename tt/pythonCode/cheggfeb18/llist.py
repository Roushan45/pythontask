class Node:

    def __init__(self, data, nextNode=None):
        self.data = data
        self.nextNode = nextNode

    def getData(self):
        return self.data

    def setData(self, val):
        self.data = val

    def getNextNode(self):
        return self.nextNode

    def setNextNode(self, val):
        self.nextNode = val


class LinkedList:

    def __init__(self, head=None):
        self.head = head
        self.size = 0

    def getSize(self):
        return self.size

    def addNode(self, data):
        newNode = Node(data, self.head)
        self.head = newNode
        self.size += 1
        return True

    def printNode(self):
        curr = self.head
        while curr:
            print(curr.data)
            curr = curr.getNextNode()

    def merge(self,list1,list2):
        print(list1.head)
        curr1=list1.head
        print(curr1)
        while 1:
            curr1=curr1.getNextNode()
            if curr1==None:
                curr2=list2.head
                print(curr2)
                break

myList1 = LinkedList()
print(myList1.addNode(90))
print(myList1.addNode(15))
print(myList1.addNode(86))

myList2 = LinkedList()
myList2.addNode(25)
myList2.addNode(56)
myList2.addNode(78)

myList1.merge(myList1,myList2)



