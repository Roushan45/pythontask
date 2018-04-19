import message
#MailBox class for storing the messages
class MailBox:
    #constructor fot initializing 
    #mail box with empty list
    def __init__(self):
        self.mailbox=[]
    #add message will append the message into 
    #mail box list
    def addMessage(self,message):
        self.mailbox.append(message)
    #get message will return message from mailbox list
    def getMessage(self,index):
        #checking for index in mailbox
        #note that list index start from 0 
        #thats ehy here index-1 used
        if index-1 >len(self.mailbox):
            return "index not found"
        return self.mailbox[index-1]
    #this will remove the message from mailbox list
    #if index not found then return error msg
    def removeMessage(self,index):
        if index-1 >len(self.mailbox):
            return "index not found"
        #storing the message that to be deleted in temp
        temp=self.mailbox[index-1]
        #deleting the messge from mailbox
        del self.mailbox[index-1]
        #returning the deleted message
        return temp
