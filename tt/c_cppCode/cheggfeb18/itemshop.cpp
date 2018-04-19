#include <fstream>
#include <sstream>
#include <string>
#include <iostream>
#include<vector>
#include<iomanip>
using namespace std;

//structure for product
struct product{
    string product_id;
    string product_name;
    double product_price;
    int qty;
    product(){}
    product(string id,string name,double price,int q){
        product_id=id;
        product_name=name;
        product_price=price;
        qty=q;
    }
};
//this method will parse the line and return the product
product getProduct(string info){
    string s;
    vector<string>v;
    stringstream ss(info);
    //splitting by comma
    while(getline(ss,s,','))
        v.push_back(s);
    //creating product
    product p(v[0],v[1],stod(v[2]),stoi(v[3]));
    return p;
}
//this method will create invoice 
//output to console and wriye to file
void printInvoice(product *p,int count){
    ofstream fout;
    fout.open("invoice.txt",ios::out);
    string name,street,city,zipCode;
    //getting the customer info
    cout<<"Enter your Name : ";
    cin.ignore();
    getline(cin,name);
    cout<<"Enter the street ";
    getline(cin,street);
    cout<<"Enter the city : ";
    getline(cin,city);
    cout<<"Enter the zip code: ";
    getline(cin,zipCode);
    cout<<"********INVOICE************"<<endl<<endl;
    cout<<name<<endl<<street<<endl<<city<<endl<<zipCode<<endl<<endl;
    fout<<name<<endl<<street<<endl<<city<<endl<<zipCode<<endl<<endl;
   double total=0;
    cout<<"Code"<<setw(10)<<"Name"<<setw(15)<<"Unit Price"<<setw(10)<<"Quantity"<<setw(10)<<"Amount"<<endl;
    fout<<"Code"<<setw(10)<<"Name"<<setw(15)<<"Unit Price"<<setw(10)<<"Quantity"<<setw(10)<<"Amount"<<endl;
    for(int i=0;i<count;i++){
        cout<<p[i].product_id<<setw(10)<<p[i].product_name<<setw(15)<<p[i].product_price<<setw(10)<<p[i].qty<<setw(10)<<(p[i].qty*p[i].product_price)<<endl;
        fout<<p[i].product_id<<setw(10)<<p[i].product_name<<setw(15)<<p[i].product_price<<setw(10)<<p[i].qty<<setw(10)<<(p[i].qty*p[i].product_price)<<endl;
        total+=(p[i].qty*p[i].product_price);
    }
    cout<<endl<<"Total : "<<total<<endl;
    fout<<endl<<"Total : "<<total<<endl;
    
}

int main(){
    ifstream fin;
    fin.open("ProductData.csv",ios::in);
    //product array for 100 object
    product *products=new product[100];
    string line;
    int count=0;
    while(getline(fin,line)){
        products[count++]=getProduct(line);
    }
    product *cart=new product[100];
    int cartCount=0;
    string input;
    while(1){
        cout<<"Enter the product no to search or enter 0 to checkout"<<endl;
        cin>>input;
        if(input=="0"){
            printInvoice(cart,cartCount);
            break;
        }
        else{
            bool found=false;
            for(int i=0;i<count;i++){
                if(products[i].product_id==input){
                    found=true;
                    cout<<"Name : "<<products[i].product_name<<endl;
                    cout<<"Price : "<<products[i].product_price<<endl;
                    int quantity_purchase;
                    if(products[i].qty==0){
                        cout<<"Item out of stock \n";
                    }
                    else{
                        cout<<"Enter the quantity to purchase : ";
                        cin>>quantity_purchase;
                        if(quantity_purchase>products[i].qty){
                            string c;
                            cout<<"Not enough quantity in stock , currently have only "<<products[i].qty<<endl;
                            cout<<"do you want add availiable stock(y/n) ? ";
                            cin>>c;
                            if(c=="yes"|| c=="y"){
                                //adding to cart
                                cart[cartCount++]=products[i];
                                products[i].qty=0;
                            }
                        }
                        else{
                            //adding to cart and decreasing the count
                            product p=products[i];
                            p.qty=quantity_purchase;
                            products[i].qty-=quantity_purchase;
                            cart[cartCount++]=p;
                        }
                        
                    }
                  

                }
                
            }//if product not found
            if(!found){
                    cout<<"product id : "<<input<<" not found!\n";
                }
        }
    }

    return 0;
}