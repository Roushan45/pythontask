#walk through sub dorectories
#check the content of file
#print the name of file which have the same contain
import os
#from weathercli import walkanother
#filenames=[]
#rootdir=input("Enter the root directory ")
#gen=os.walk("/home/Rakesh/tt/pythonCode/testw/")
#print(dir(gen))
#a,b,c=next(gen)
#print("{}{}{}".format(a,b,c))
d = {'k1': 12, 'k2':11, 'k3':23, 'k4':12, 'k5':23}
d1=dict()
for j in d.keys():
    flag=False
    for i in d1.keys():
        if d[j]==d1[i]:
            flag=True
    if not flag:
        d1[j]=d[j]

val=[]
d1=dict()
for i in d.keys():
    flag=False
    if d[i] not in val:
        val.append(d[i])
        flag=True
    if flag:
        d1[i]=d[i]
    


print(d1)
#for r,s,f in os.walk("/home/ubuntu/Rakesh/tt"):
#    for name in f:
#        filenames.append(os.path.join(r,name))

#print(filenames)