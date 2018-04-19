#from withoutinit import
import withoutinit
print(withoutinit.test())

class Test:
    def __init__(self):
        return None

    def show(self):
        print('sj')

t=Test()
t.show()


t=set(range(3,12))

print(t)
