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