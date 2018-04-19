#importing the module that created
from message import Message 
from mailbox import MailBox
#created mailbox object
mailBox = MailBox()
#created message
m=Message("Rakesh","Roushan")
m.append("I have sent you the courier.")
m.append("Please check and confirm.")
#created another message
m2 = Message("John","Smith Roy")
m2.append("Hi,Can we have a call around 4pm.")
m2.append("Just tried to reach you but not happened.")
#added to mailbox
mailBox.addMessage(m)
mailBox.addMessage(m2)
#priting the message
print(mailBox.getMessage(1))
print(mailBox.getMessage(2))
#removing the message
print("Removed Message from Mailbox : \n",mailBox.removeMessage(2))