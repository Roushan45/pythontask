import sys
#method small large which takes
#list as a parameter
def smallLarge(list):
    #taken too variable for storing the small and large
    #initialize with max and min value
    small=sys.maxsize
    large=-sys.maxsize
    #using for loop iterating the list
    for i in list:
        #getting large value
        if i>large:
            large=i
        #getting small value
        if i<small:
            small=i
    #returning the value as tuple
    return (small,large)
#created a list with some integer values
list=[4,65,2,7,234,99,56,23,78,12,55]
#calling the function smallLarge with list
#parameter and storing the output in values
values=smallLarge(list)
#getting the seprate values from list
smaller,largest = values
print("Smallest element in List : ",smaller)
print("Largest element in List : ",largest)