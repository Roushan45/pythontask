#include<iostream>
using namespace std;
#define BODY_MASS_MULTIPLIER  703

//getting the weight 
void getWeight(double &inputWeight){
    cout<<"Enter the weight : ";
    cin>>inputWeight;
}
//getting the height
void getHeight(double &inputHeight){
    cout<<"Enter the height : ";
    cin>>inputHeight;
}
//calculating the BMI and setting the BMI
void setMass(double weight, double height, double &BMI){
    BMI=weight*(BODY_MASS_MULTIPLIER/(height*height));
}
//displaying the BMI
void showBMI(double BMI){
    cout<<"Body Mass Indicator : "<<BMI<<endl;
}

//Main module
int main(){
    double inputHeight,inputWeight,BMI;
    //calling the functions
    getWeight(inputWeight);
    getHeight(inputHeight);
    setMass(inputWeight,inputHeight,BMI);
    showBMI(BMI);
    return 0;
}