import urllib.request
while 1:
    #getting the currency
    original_currency=(input('What is the original currency? '))
    convert_to_currency=input("What currency do you want to convert to? ")
    amount=0
    #validating and taking amount
    while 1:
        try:
            amount=int(input("How much do you want to convert (int)? "))
            break
        except Exception as e:
            print("The value you input must be an integer. Please try again.")
    #constructing the url
    url='https://finance.google.com/finance/converter?a={:d}&from={:s}&to={:s}'.format(amount,original_currency,convert_to_currency)
   #getting the response
    response=urllib.request.urlopen(url)
    line=""
   #searching for line that contains converted result
    for i in response.readlines():
        i=str(i)
        #this is the div id that contains result
        if 'id=currency_converter_result' in i:
            line=i
            break
    #processing the string , first splitting vy >
    line=line.strip().split('>')
    #in case of bad request
    if len(line)<4:
        print("Bad request , currency mismatch")
    else:
        #printing the result
        converted_currency=line[2].split('<')[0]
        #if converted in decimal then rounding it to 2 decimal places
        if '.' in converted_currency:
            #first splited the string by " "
            converted_currency=converted_currency.split()
            #converting to float and rounding
            converted_currency[0]=round(float(converted_currency[0]),2)
            #again converted to string
            converted_currency=str(converted_currency[0])+" "+converted_currency[1]
      #  print(amount)
       # print(original_currency)
        #print(converted_currency)
        print("{:d} {:s} = {:s}".format(amount,original_currency,converted_currency))
    #getting response for next conversion
    ans=input('Do you want to convert another currency?(Y/N)  ').lower()
    if ans=='n' or ans == 'no':
        break
