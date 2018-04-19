import random
def numRolls():
   #empty rolls list that will contain dice value
   rolls=[]
   count = 0
   while(True):
   #define a boolean variable for conditin matching
       exitCondition=False
       #please note here randint(1,6) function will generate
       #random no between 1 and 6 (both inclusive) no need to add +1
       #just tested its generating 7 also
       nextRoll = random.randint(1,6)
       #appending the value to list
       rolls.append(nextRoll)
       #if first generated no is equal to 5
       if(nextRoll==5 and count == 0):
           exitCondition=True
       #if current generataed no equals to first generated no
       if(nextRoll==rolls[0] and len(rolls)>1):
           exitCondition=True
       #if any time sum of two value equal to 7
       for x in range(len(rolls)-1):
           for y in range(len(rolls)):
               if(rolls[x] + rolls[y] == 7 and x != y ):
                   exitCondition=True
       #if(len(rolls)>=2 and (rolls[len(rolls)-2] + rolls[len(rolls)-1])==7):
           #exitCondition=True
       if(exitCondition==True):
           break
       count = count+1
   return len(rolls)
#calling the function
if __name__=="main":
    no=numRolls()
    print("Number of rolls : ",no)
