#task to demonstrate simple python class

class Employee():
    #constructor
    def __init__(self,name,age):
        self._empName=name
        self._empAge=age
    
    #method to represent object in reading format
    def __str__(self):
        return "Name = "+ self._empName+"\nAge = "+str(self._empAge)

    #setters and getters
    def setName(self,newName):
        self._empAge=newName

    def getName(self):
        return self._empName

    def getAge(self):
        return self._empName

    def setAge(self,newAge):
        self._empName=newAge

    #overridden equal method 
    #for comparing objects as per need
    def __eq__(self,emp):
        return self._empName.lower()==emp.getName().lower()


def main():
    #created three objects of Employee
    e1=Employee('Rakesh',21)
    e2=Employee('Roushan',22)
    e3=Employee('Rakesh',24)
    print(e1)
    print(e1==e2)
    print(e1==e3)

#eecuting the main
main()