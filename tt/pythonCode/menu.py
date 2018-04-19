#displaying the menu item
print ("Davy's auto shop services \nOil change -- $35\nTire rotation -- $19\nCar wash -- $7\nCar wax -- $12")
first_service = input("Select first service : ").lower()
second_service = input("Select second service : ").lower()
#checking for service type and 
#accordingly calculating the price
if(first_service == 'oil change'):
    first_service=first_service+", $35"
elif first_service == 'tire rotation':
    first_service=first_service+", $19"
elif first_service == 'car wash':
    first_service=first_service+", $7"
else:
    first_service=first_service+", $12"
if(second_service == 'oil change'):
    second_service=second_service+", $35"
elif second_service == 'tire rotation':
    second_service=second_service+", $19"
elif second_service == 'car wash':
    second_service=second_service+", $7"
else:
    second_service=second_service+", $12"
#printing the invoice
print ("\nDavy's auto shop invoice")
print ("Service 1 : "+first_service)
print ("Service 2 : "+second_service)
p1 = first_service.split("$")[1]
p2 = second_service.split("$")[1]
total = int(p1) + int(p2)
print ("Total: $"+str(total))