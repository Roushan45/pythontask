x=0.5
a=0
b=0
c=0
for i in range(1,1999+1):
    y=x*x+10
    a=a+1
    for j in range(i+1,1999+3):
        z=x*y+2.5
        b=b+1
        w=y*z
        c=c+1

    if i==2:
        break
    a = 0
    b = 0
    c = 0

print("{} {} {} {}".format(a,b,c,(a+b+c)))
