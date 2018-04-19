#include <iostream>
using namespace std;
 
class SLL{
private:
int data;
Node* front;
Node* next;
public:
SLL{
front = NULL;
}
Node(int d, Node* n){
data = d;
next = n;
}
int getData(){
return data;
}
Node* getNext(){
return next;
}
void setData(int d){
data = d;
}
void setNext(Node* n){
next = n;
}
};
 
void insertToFront(int d){
if(front == NULL){
Node* nn = new Node(d, NULL);
nn = front;
front = nn;
}
else{
Node* nn = new Node(d, NULL);
front = nn;
}
}
 
void deleteFront(){
if(front == NULL){
return;
}
else if(front -> next == NULL){
delete front;
front = NULL;
}
else{
Node* temp;
temp = front;
front = front ->next;
delete temp;
}
}
 
void insertToBack(int d){
Node* nn = new Node(d, NULL);
if (front == NULL){
front = nn;
}
else{
Node* temp = front;
while(temp -> next != NULL){
temp = temp -> next;
}
temp -> next  = nn;
}
}
 
void deleteBack(int d){
if(front -> == NULL){
delete front;
front = NULL;
}
else{
Node* nextToEnd = front;
Node* end = front -> next;
while(end -> next != NULL){
nextToEnd = end;
end = end -> next;
}
delete end;
nextToEnd -> next = NULL;
}
}
 
void printList(){
if(front == NULL){
return;
}
while(temp != NULL){
Node *temp;
temp = front;
cout << temp -> data;
temp = temp -> next;
}
}
 
bool deleteMiddle(int d){
        Node *temp;
        if (front->next == NULL || front == NULL)
                return false;
        temp = front->next;
        front -> data = temp -> data;
        front -> next = temp -> next;
        return true;
}
 
void insertMiddle(int d){
if(front == NULL){
return;
}
else{
Node* temp = front;
int size = 0;
while(temp != NULL){
temp = temp -> next;
size++;
}
size = size / 2;
}
Node* nn = new Node(d, NULL);
temp = front;
for(int i = 1; i < size/2; i++){
temp = temp -> next;
}
nn -> next = temp -> next;
temp -> next = nn; 
}
 
 
void printSmallest(){
Node *temp;
if(front == NULL){
return;
}
while(temp != NULL && temp < front){
temp = front -> next;
front = temp;
}
}
 
void deleteAllNodes(int d){
if(temp -> data = front){
Node* temp;
temp = front;
delete temp;
}
Node* temp = front;
while(temp > next -> data != NULL){
temp = temp -> next;
Node* curr = temp -> next;
temp -> next = curr -> next;
delete curr;
}
}
 
 
int main(){
/*SLL* list;
    list->insertToFront(11);
    list->insertToFront(12);
    list->insertToFront(13);
    list->printList();
    list->deleteAllNodes();
    
    Node* a = new Node(5, NULL);
    Node* b = new Node(3, NULL);
    Node* c = new Node(4, NULL);
    list->insertToFront(a);
    list->insertToFront(b);
    list->insertToFront(c);
    list->printList();
    list->deleteMiddle(4);
    list->printList();
    list->deleteMiddle(6);
    list->printList();
    list->deleteAllNodes();
    
    list->insertToFront(20);
    list->insertToFront(22);
    list->insertToFront(21);
    list->printList();
    Node* smallPtr = NULL;
    smallPtr = list->printSmallest(smallPtr);
    cout<<smallPtr->data<<endl;*/
    
    SLL list;
    list->insertToFront(5);
    list->insertToFront(6);
    list->insertToFront(10);
    
    Node* a = new Node(5, NULL);
Node* b = new Node(3, NULL);
Node* c = new Node(7, NULL);
list->insertToFront(a);
list->insertToFront(b);
list->insertToFront(c);
    
    list->deleteFront();
    list->insertToBack(3);
    list->insertToBack(2);
    
    list->deleteBack();
    list->printList;
    
    list->deleteMiddle();
    list->insertMiddle(5);
    
    list->printSmallest();
    list->deleteAllNodes;
    
    list->insertToFront(20);
    list->insertToFront(22);
    list->insertToFront(21);
    list->printList();
    Node* smallPtr = NULL;
    smallPtr = list->printSmallest(smallPtr);
    cout<<smallPtr->data<<endl;*/
    
    
    return 0;
}
