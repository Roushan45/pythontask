class coustom:
	def __init__(self,x):
		self.x=x
	def __add__(self,coustom):
		return self.x+coustom.x
	def __sub__(self,coustom):
		return self.x-coustom.x

o1=coustom(5)
o2=coustom(10)
print(o1-o2)
print(o1+o2)
