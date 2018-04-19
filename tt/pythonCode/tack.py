class Stack:
    def __init__(self):
        #creating an empty list
        self.list=[]
    def push(self,item):
        #append to list
        self.list.append(item)
    def pop(self):
        #dont mention what you want to pop
        return self.list.pop()
    def peek(self):
        return self.list[len(self.list)-1]
    def size(size):
        #return len of list
        return len(self.list)
    def is__empty(self):
        if len(self.list)==0:
            return True
        else:
            return False
    #reverse method for stack
    def reverse(self):
        #copy the stack to another list
        l=self.list
        #length of list
        s=len(l)
        #emptied the stack
        self.list=[]
        for i in range(0,s):
            #in running loop poping the content 
            #temp list and appending to list
            #by doing this way list is gonna reversed
            self.list.append(l.pop())
        return self.list
s1=Stack()   
s1.push(5)
s1.push(6)
s1.push(7)
print ("Before reverse Peek element : ",s1.peek())
s1.reverse()
print ("After reverse Peek element : ",s1.peek())