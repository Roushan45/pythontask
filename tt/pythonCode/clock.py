class Time:
    _hour=0
    _mins=0
    _secs=0
    def __init__(self,_hr,_mn,_s):
        """__init__ will initialize the instance variable
        __repr__ function member will display formal represent of an object 
        __str___ function member will display the object in human represent mode
        from_str function member will change HH:MM:SS to new value """
        self._hour=_hr
        self._mins=_mn
        self._secs=_s
        
    def __repr__(self):
        return "Class Time: "+str(self._hour)+":"+str(self._mins)+":"+str(self._secs)
     
    def __str__(self):
        return ""+str(self._hour)+":"+str(self._mins)+":"+str(self._secs)
        
    def from_str(self,time):
        self._hour=time.split(':')[0]
        self._mins=time.split(':')[1]
        self._secs=time.split(':')[2]
        
