class Link (object):
    def __init__(self, data, n = None):
        self.data = data
        self.next = n
    def get_next(self):
        return self.next
    
    def set_next(self, n):
        self.next = n
        
    def get_data(self):
        return self.data
    
    def set_data(self, d):
        self.data = d
        
    def __str__(self):
        return str(self.data)

class CircularList(object):
    
    def __init__(self):
        self.head=None
        self.end=None
        self.size=0
    # Insert an element in the list   
    def insert(self,item):
        temp=Link(item)
        if(self.head==None):
            temp.set_next(self.head)
            self.head=temp
           # self.end=self.head
            self.size=self.size+1
            
        temp.set_next(self.head)
        self.head=temp
        self.size=self.size+1
    # Delete a link with a given key   
    def delete(self, key):
        if(key<0|key>size):
            print"Invalid key"
            return
            
        if(key==0):
            if(self.head==None):
                print"Empty List"
                return
            
            head=head.get_next()
            return
            
        if(key==self.size):
            temp1 = self.head
            temp2 = self.head
            count=1
            while(count<self.size-1):
                temp2=temp1.get_next()
                count=count+1
            temp2.set_next(self.end)
            
        if(key>0&key<self.size):
            temp3=self.head
            count=1
            while(count<key-1):
                temp3=temp3.get_next()
                count=count+1
                
            temp3.set_next(temp3.get_next().get_next())
            
    # Find the link with the given key
    def find(self, key):
        if(self.head==None):
            return "Empty List"
            
        current=self.head
        count=1
        while(count<self.size):
            if(count==key):
                print("value is ",current.get_data())
                return    
            current=current.get_next()
            count=count+1
        
    # Return a string representation of a Circular List  
    def __str__(self):
        if(self.head==None):
            return "empty list"
        count=1    
        current=self.head
        while(count<self.size):
            print(current.get_data())
            current=current.get_next()
            count=count+1
        print self.head.get_data()
        return ""
            
            
            
            
circularlist=CircularList()
print"Adding data"
circularlist.insert(34)
circularlist.insert(45)
circularlist.insert(23)
circularlist.insert(67)
circularlist.insert(7)
print(circularlist)
print"finding key 2"
circularlist.find(2)
print"deleting key 3"
circularlist.delete(3)
print(circularlist)


