"""
Task to get familiar with string and its methods
given a csv file and  contains name and rbi score
it also contains bad data task to filter all valid score and
get the player having the max RBI value
"""
# open the file in read mode
batting_file = open("batting.csv","r")
career_ribs={}#empty dictionary
for line in batting_file.readlines():
    line=line.strip()
    values = line.split(",")#splitting the va;ues
    if values[0]=='playerID':
        continue
    batter_id = values[0]
    rbis = values[1]#geting the rbis and values
    if rbis.isalpha():#ignoring the non-digit
        continue
    if batter_id not in career_ribs:
        career_ribs[batter_id]=int(rbis)#if not already adding to dict
    else:
        temp=career_ribs[batter_id]#if already then first getting its value
        career_ribs[batter_id]=temp+int(rbis)#and adding the new values
max_rbi=0
max_player=''
# looping through dict for ginding the max rbi
# and max_player
for key,value in career_ribs.items():
    if max_rbi < value:
        max_rbi = value
        max_player = key
#once found printing the data
print("Player With Max RBI {} have ID  {}".format(max_rbi,max_player))