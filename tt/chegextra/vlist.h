#include <vector>
#include <string>
using namespace std;
 
#ifndef vlist_H
#define vlist_H
 
class vlist
{
public:
    vlist();
    vlist(const vlist &);
    ~vlist();
    bool Is_Empty();
    string Search(const string &);
    void Insert(const string &);
    void Remove(const string &);
    void Print();
private:
   // vector<string> *DB;
    int count;
};
#endif
