def twist(string):
    #The first letter of each word in the string
    #is captalized
    print(string.title())
    #the string in all capital chars
    print(string.upper())
    # every other character in all lower case characters
    print(string[::2].lower())
    #the string reversed in ALL CAPS and replacing the spaces
    #with the ~ character
    print(string[::-1].upper().replace(' ','~'))

def stats(string):
    #the number of spaces in the string
    print('Number of spaces in string {}'.format(string.count(' ')))
    #the number of words in the string
    print('Number if words in string '.format(len(string.split())))
    count=0
    for i in string.lower():
        if i in 'aeiou':
            count+=1
    print('No of vowels : {}'.format(count))

def main():
    #asking for string
    string=input('Enter the string : ')
    #calling the functions with given string
    twist(string)
    print()
    stats(string)

#executing the main
main()