template <typename T>
class store {
private:
T value;
public:
store(const T& item);//removed constructor initializatio
T& getValue() ;//removed const as T is refernce type 
void setValue(const T& item) ;//removed const as T is refernce type 
};//added  semicolon
//started initialization of constructor and methods
//added template before constructor
template <class T>
store<T>::store(const T& item)
{
	value=item;
}
//same as above added tepmlate
template <class T>
T& store<T>::getValue() {
return value;
}
template <class T>
void store<T>::setValue(const T& item){
value = item;
}

