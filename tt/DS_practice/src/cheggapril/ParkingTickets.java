package cheggapril;

public class ParkingTickets {

	public static void main(String[] args) {
		//an integer array 
		//first element containing the no of 
		//entry in array , here taken 30
		//so after first element 30 entry in array
		int parkingTickets[]={30,486,12,45,140,290,56,34,660,1254,445,112,450,
							   45,64,676,430,435,239,56,980,45,36,656,90,222,
							    23,34,459,43,123};
		//as said in problem statement 
		//only 2 variable can be used
		//most ticket will track the no 
		//of most ticket in array
		int mostTicket = Integer.MIN_VALUE;
		//k is used for index tracking of 
		//integer array
		int k;
		//in for loop running the loop 30 times
		//parkingTickets[0]// equal to 30
		//its first element of array;
		for(k=1;k<=parkingTickets[0];k++){
			//comparing the values
			if(parkingTickets[k]>mostTicket)
				mostTicket=parkingTickets[k];
		}
		//printing the most parking tickets
		System.out.println("Most parking tickets in Integer array is "+mostTicket);
	}

}
