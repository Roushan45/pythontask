
from random import randint

def housekeeping():
    #using the variables that declares globally
    global myRandomNumber, guess, prompt
    #getting the random number
    myRandomNumber = randint(0, 10)
    print(prompt ,end=' ')
    guess=input()
    return

#this method will print the generated random number
def detail():
    global myRandomNumber
    print("Generated Random Number : {}".format(myRandomNumber))
    return

#global var declaration
myRandomNumber=-1
guess=-1
prompt = "enter a number between 1 and 10: "
housekeeping()
detail()

