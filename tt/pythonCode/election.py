houseMember=435
senateMember=100
#def bill pass will return true or false
#on basis of vote count
def billPass(vote,chamber):
        return vote>=268
#main definition
def main():
    n=0
    #getting the vote count from user
    while True:
        #using try block for validating the vote type
        try:
             n = input("Please enter no of vote: ")
             n = int(n)
             break
        # if not vote type is int then error mesg printed
        except ValueError:
            print("No valid vote count ! Please try again ...")
# asking user for chamber name
    chamber = input("enter the chamber : ")
#getting the status of bill pass by callng th ebill pass method
    print ("Is enough vote to pass bill : ",billPass(n,chamber))
#calling the main
if __name__=="__main__":
    main()