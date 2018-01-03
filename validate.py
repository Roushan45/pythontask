#practice for validating the values and raising the exception
def nfv(rate, nper, cost, cf = []):
	tot = 0.0
	for i in range(0, nper):
		tot += cf[i]*(1+rate)**(nper-i)
	ans = tot - cost*(1+rate)**(nper)
	print ans

def main():
	while True:
		try:
			rate = input("What is the rate: ")
			if rate>=1.0:
				break
			else:
				rate = input("Please enter a postiive rate")
				continue
		except Exception as e:
			print "error"
			continue
	while True:
		nper = input("What is the number of periods: ")
		if nper > 0:
			break
		else:
			print "Time can't be negative dumbass"
			nper = int(raw_input("> "))
			continue
	while True:
		cost = int(raw_input("What is the cost: "))
		if cost > 0:
			break
		else:
			print "Cost must be postive"
			cost = int(raw_input("> "))
			continue
	while True:
		cf=[]
		for i in range(1, nper+1):
			x = input("Please enter cf %d: " % (i))
			cf.append(x)
		break
	#previously you were pssing like 
	#ans = nfv(rate, nper, cost, cf=[])
	#cf=[] , it is empty list thats why u getting 
	#index out of range
	ans = nfv(rate, nper, cost, cf)
	print(ans)

main()
