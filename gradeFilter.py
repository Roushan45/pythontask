#opened the file1 for reading
#please replace the filename as yours
file1 = open('csvfile1.csv','r')
#read and add to list
li = [x.strip().split(",") for x in file1.readlines()]
temp=[]#it contains unoque id
for i in li:
    if i[0] not in temp:
        temp.append(i[0])
result=[]
for k in temp:
    temp1=[]
    for l in li:
        if k==l[0]:#if id matcch
            temp1.append(l[1])#adding all grades for matching
    temp1.insert(0,k)
    result.append(temp1)
#outfile for writting
outFile = open('csvfile2.csv','w')
for x in result:
    outFile.write(",".join(x)+"\n")
