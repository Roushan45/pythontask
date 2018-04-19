#dclared the dictionary for storing the all intermediate
#values of factorial
cached_dict = {}
#function cached factorial that takes number 
#for calculating factorial
def cachedfactorial(number):
    #Exit condition for recursion
    if number < 2: return 1
    #if number not found on cached dictionary
    #then only calculating the factorial of next number
    if number not in cached_dict:
        cached_dict[number] = number * cachedfactorial(number-1)
    #if number found in cached dictionary then returning
    #respective value of
    return cached_dict[number]
#calling the function for calculating factorial
print "factorial of 5",cachedfactorial(5)
print "factorial of 7",cachedfactorial(7)
print "factorial of 6",cachedfactorial(6)

#printing the cached dictionary values:
print "cached values in dictionary : "
print cached_dict