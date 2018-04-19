
def checkRange(given_range,nu):
    """
    This function will check the number in range
    example: start number is  4
    end number is 8
    then 4 and 8 will not be in range , 5,6,7 are the range value
    :param given_range:
    :param nu:
    :return:
    """
    if nu<given_range[1] and nu>given_range[0]:
        return True
while 1:
    #asking the start range
    start_range = int(input("Enter the start range : "))
    #end range
    end_range = int(input("Enter the end range : "))
    #number to check
    nu=int(input("Enter the number to check : "))
    #calling the function if in range
    if checkRange((start_range,end_range),nu):
        print("Number in range ")
    else:#if not in range
        print("Number not in range")
    #asking if want to check another
    ans=input("do you want to check another (y/n) ? : ").lower()
    if ans=='n' or ans == 'no':
        break
    print()
