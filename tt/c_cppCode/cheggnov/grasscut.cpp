#include<iostream>
using namespace std;

int main(){
    int plot_length;
    int plot_width;
    double plot_area;
    int house_length;
    int house_width;
    double house_area;
    float time;
    cout<<"Enter the lenght of plot : ";
    cin>>plot_length;
    cout<<"Enter the width of plot : ";
    cin>>plot_width;
    cout<<"Enter the length of house : ";
    cin>>house_length;
    cout<<"Enter the width of house : ";
    cin>>house_width;
    house_area=house_length*house_width;
    plot_area=plot_length*plot_width;
    cout<<endl<<"Lenth and Width of plot : "<<plot_length<<"  "<<plot_width<<endl;
    cout<<"Lenth and Width of house : "<<house_length<<"  "<<house_width<<endl;
    cout<<"Ares of Plot : "<<plot_area<<" sqft"<<endl;
     cout<<"Ares of house : "<<house_area<<" sqft"<<endl;
    double area_to_cut_grass=plot_area-house_area;
    cout<<"Area of remaining space that grass need to cut : "<<area_to_cut_grass<<endl<<" sqft";
    float mnts=(area_to_cut_grass/2)/60;
    cout<<endl<<mnts<<" minutes required to cut the grass."<<endl;
    return 0;
}