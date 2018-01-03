def read_game(fp):
    #empty dictionary
    player_dict={}
    #reading line  by line
    for line in fp.readlines():
        #splitted the line by ,
        temp=line.strip().split(",")
        #adding to dictionary
        #key will be name of playuer and rest entries will be
        #score , using tuple() converting to tuple
        player_dict[temp[0]]=tuple(temp[1:])
    #returning dictionary to caller
    return player_dict

if __name__=="__main__":
    #opening the file name
    fp = open("game.txt",'r')
    #calling the above function with file
    #and output the result
    print(read_game(fp))