template <typename T>
class store {
private:
T value;
public:
store(const T& item);
T& getValue() const;
void setValue(const T& item) ;
};
template <class T>
store<T>::store(const T& item)
{
	value=item;
}
template <class T>
T& store<T>::getValue() const{
return value;
}
template <class T>
void store<T>::setValue(const T& item){
value = item;
}
int main()
{
	
	return 0;
}
