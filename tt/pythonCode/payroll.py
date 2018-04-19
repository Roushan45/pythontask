def payroll(input,output):
    """
    This method will calculate the pay and write to file
    :param input:
    :param output:
    :return:
    """
    #opened the input as read
    input_file=open(input,'r')
    #opened the write file as write mode
    output_file=open(output,'w')
    #reading line by line
    for line in input_file.readlines():
        #if blank line then not writting to file
        if len(line.strip())<2:
            continue
        #splitting the string and removeing the wgite spaces
        #regardless of no of white spaces
        line=[x.strip() for x in line.split()]
        #calculating the pay by parsing to int and float
        pay=round(int(line[0])*float(line[1]),2)
        #writting to utput file by parsing to string
        output_file.write(str(pay)+"\n")

#calling the payroll with input and output file
payroll("pay1.txt","out1.txt")

#written extra please remove if not required
#Reading the output file:
print("Out file content .. \n")
try:
    f=open('out1.txt','r')
    for line in f.readlines():
        print(line,end='')
except Exception as e:
    pass