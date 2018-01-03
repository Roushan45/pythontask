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

class HR(Employee):
    def __init__(self,name,age,depart):
        #this will call the super class init
        super().__init__(name,age)
        self._department=depart

    def getDepartment(self):
        return self._department

    def setDepartment(self,newDepart):
        self._department=newDepart

    def __str__(self):
        return super().__str__()+"\nDepartment = "+self._department
def main():
    e1=HR("Sushant",21,"HR")
    print(e1.getName())
    print(e1.getAge())
    print(e1.getDepartment())
    print(dir(e1))

main()