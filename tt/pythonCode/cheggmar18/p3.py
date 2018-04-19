class Employee(object):
    """
    base class Employee have the private data
    variables initialized by constructor
    """
    def __init__(self,name,base_sal,phone,):
        self.__name=name
        self.__base_sal=base_sal
        self.__phone_num=phone

    #getters for name and phone number
    def getName(self):
        return self.__name

    def getPhone(self):
        return self.__phone_num

    def sal_total(self):
        return self.__base_sal

    def mutator(self,new_sal):
        self.__base_sal=new_sal

    #for string representation of object
    def __str__(self):
        return "Employee({}), {}, {}".format(self.__name,self.__phone_num,self.sal_total())
    #for official representation of object
    def __repr__(self):
        return "Employee"

#class engineer inheriting Employee class
class Engineer(Employee):
    def __init__(self,name,base_sal,phone):
        #calling the super constructor
        super().__init__(name,base_sal,phone)

    def __str__(self):
        return "Engineer({}), {}, {}".format(super().getName(),self.getPhone(),self.sal_total())

    def __repr__(self):
        return "Engineer"

#manager class
class Manager(Employee):
    def __init__(self,name,base_sal,phone,bonus):
        super().__init__(name,base_sal,phone)
        #have extra one variables
        self.bonus=bonus

    def sal_total(self):
        return super().sal_total()+self.bonus

    def __str__(self):
        return "Manager({}), {}, {}".format(super().getName(),self.getPhone(),self.sal_total())

    def __repr__(self):
        return "Manager"

class CEO(Manager):
    def __init__(self,name,base_sal,phone,bonus,stock):
        super().__init__(name,base_sal,phone,bonus)
        self.stock=stock

    def sal_total(self):
        return super().sal_total()+self.stock

    def __str__(self):
        return "CEO({}), {}, {}".format(super().getName(),self.getPhone(),self.sal_total())

    def __repr__(self):
        return "CEO"

#def print staff for printing the staff sequence
def print_staff(staffs):
    for i in staffs:
        print(i,end='\n\n')

#main for calling the stuffs
def main():
    #created the list of staffs
    staffs=[Employee('Peter',1000.50,'+1(548987)'),\
    Manager("john",2311.60,'+1(7849987)',673),Engineer("soktu",1023.63,'+91(956445)'),\
            CEO("Farokty Humer",65343.45,'+1(687564)',6673,878)]
    #calling the print staffs method
    print_staff(staffs)

main()
