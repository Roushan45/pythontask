#Message class that have email body format
class Message:
    #constructor for creating object
    def __init__(self,sender,recipient):
        self.sender=sender
        self.recipient=recipient
        self.message=""
    #append message for appending message to
    #message body
    def append(self,message):
        self.message=self.message+message+"\n"
    #toString method for Message representation
    def __str__(self):
        return "From : "+self.sender+"\nTo : "+self.recipient+"\n"+self.message
