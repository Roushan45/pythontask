class Employee():
    def __init__(self,firstName,lastName,_role,skills):
        self.fname=firstName
        self.lname=lastName
        self.role=_role
        self.skill=[]
        self.skill.extend(skills)

    def getFirstName(self):
        return self.fname

    def getLastName(self):
        return self.lname

    def getRole(self):
        return self.role

    def getSkills(self):
        return self.skill

    def setFirstName(self,value):
        self.fname=value

    def setLastName(self,value):
        self.lname=value

    def updateSkills(self,value):
        self.skill.append(value)

    def __str__(self):
        return "Name = {} {} \nRole={} \nSkills = {}".format(self.fname,self.lname,self.role,self.skill)

emplist=[]

def readEmployeeData(fp):
    for line in fp.readlines():
        line=line.strip().split(',')
        emplist.append(Employee(line[0],line[1],line[2],line[3:]))
    return emplist

def updateFile(fp):
    line=''
    for i in emplist:
        line+=i.getFirstName()+","
        line+=i.getLastName()+","
        line+=i.getRole()+","
        skill=",".join(list(i.getSkills()))
        line+=skill
        print(line)
        line=''
        fp.write(line,'\n')


def deleteEmployee():
    pass

def main():
    fp=open('employeedata.txt','r')
    li=readEmployeeData(fp)
    fp=open('employeedata.txt','w')
    updateFile()

main()