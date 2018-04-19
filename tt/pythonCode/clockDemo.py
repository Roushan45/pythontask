import clock

#creating an object of Time
#by passing three params
#it will invoke the __init__
print "calling __init__ function member\n"
A=clock.Time(23,23,12);
#printing the time by 
#calling the __repr__
print "calling __repr__ function member"
print repr(A)
#setting new time by
#calling the from_str
#by passing one param
print "\ncalling from_str function member"
A.from_str("12:23:45")
#finally calling the __str__
#it will invoke inplicitly
#on object
print "\ncalling __str__ function member"
print A
#hence all four defined in clock.py
#getting called