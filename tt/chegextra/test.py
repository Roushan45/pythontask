def sumTo(x,y):
    #delared local variable that 
    #will hold sum
    sum=0
    #if value of x is more than y
    #swapping the values using one temp
    #variable
    if(x>y):
        temp=y
        y=x
        x=temp
    #loop start here no conditional
    #statement inside loop
    while(x<=y):
        sum=sum+x
        x=x+1
    return sum
#taking input from user
no1 = input("enter the first no :")
no2 = input("enter the second no :")
#printing the sum by calling 
#sumTo method passing both
#variable in function
print 'sum = ',sumTo(no1,no2)
#/sbin/chkconfig --list | grep '3:on'