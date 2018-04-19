//header file
//class name
class Inventory
{
	//private instance values
	private:
		int itemNo;
		int quantity;
		double cost;
		double totalCost;
	// functions
	public:
		//constructor , setting all 
		//values to zero
		Inventory(){
			itemNo=0;
			quantity=0;
			cost=0;
			totalCost=0;
		}
		//mutators and accessors for
		//above fields
		void setItemNumber(int item){
			itemNo=item;
		}
		void setQuantity(int quant){
			quantity = quant;
		}
		void setCost(double c){
			cost=c;
		}
		void setTotalCost(double total){
			totalCost=total;
		}
		int getItemNumber(){
			return itemNo;
		}
		int getQuantity(){
			return quantity;
		}
		double getCost(){
			return cost;
		}
		double getTotalCost(){
			return totalCost;
		}
};

