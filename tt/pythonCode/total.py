inputFileName = input("Input file name: ")
outputFileName = input("Output file name: ")
#rinputFile open below for reading
#infile = open(inputFileName, "r")
outfile = open(outputFileName, "w")
total = 0.0
count = 0
'''line = infile.readline()
while line != "" :
    value = float(line)
    print(value)
    outfile.write("%15.2f\n" % value)
    total = total + value
    count = count + 1
    line = infile.readline()'''
#reading the file in more efficient way
#it will take care of closing the file well
with open(inputFileName) as f:
    for line in f:
        value = float(line)
        outfile.write("%15.2f\n" % value)
        total = total + value
        count = count + 1
outfile.write("Total: %8.2f\n" % total)
outfile.write("%15s\n" % "--------")
avg = total / count
outfile.write("Average: %6.2f\n" % avg)
#infile.close()
outfile.close()