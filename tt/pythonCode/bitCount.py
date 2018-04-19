
import sys

#declared two global counter variable
#for keeping count the string character
count1=0
count2=0
def Ones(s):
    if not s:
        print "in not s"
        return 0
    if s[0]=='1':
       # print "info if ",(s[1:])
        return 1 + Ones(s[1:])
    else:
      #  print "info else ",(s[1:])
        return Ones(s[1:])

def Zeros(s):
    no=0;
    global count1
    #recursion base condition
    #if counter reaches the length of 
    #string then return the sum of zeros
    if(count1>=len(s)):
        return 0
    #here checking the no of zeros
    #in string using counter variable
    if(s[count1]=='0'):
        #if 0 found incesing the no 
        no = no+1
        #incresing the counter variable
        count1=count1+1
        #returning the sum and calling Zeros function
        return no + Zeros(s)
    else:
        #here if not found zero then still 
        #increasing the counter variable
        count1=count1+1
        #calling the method
        return Zeros(s)
    
# def Ones(s):
    # #same comment applicable in
    # #this function only diffferent is
    # #here finding the 1 
    # no=0;
    # global count2
    # if(count2>=len(s)):
        # return no
    # #here finding the 1 in 
    # #string variable
    # if(s[count2]=='1'):
        # no = no+1
        # count2=count2+1
        # return no + Ones(s)
    # else:
        # count2=count2+1
        # return Ones(s)

def main():
    s = sys.argv[1]
    stdio.writef('Zeros = %d, ones = %d, total = %d\n',Zeros(s), Ones(s), len(s))
    
if __name__ == '__main__':
    main()