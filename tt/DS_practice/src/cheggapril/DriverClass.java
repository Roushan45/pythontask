package cheggapril;
//driver class that will demonstrate all
//functionality of Client and pet class
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DriverClass {

	public static void main(String[] args) {
		// Declared and intialized 
		//array of 5 clients
		//as per requierment
		Client _arrayOfClients [] =new Client[5];
		List<String> fileInfo =null;
		try {
			//Read whole file at once using 
			//nio library
			//please note that you need to do specify your 
			//file location in your local system
			fileInfo= Files.readAllLines(Paths.get("G:\\tt\\info.txt"));
		} catch (IOException e) {
			System.out.println("file not found");
		}
		//index will track the line in list
		int j=0,index=0;
		//reading line by line and performing
		//required operation on file
		while(index<fileInfo.size()){
			//spiliting the lines into word
			//using split funtion passing the ' delimeter
			String array[] = fileInfo.get(index).split(",");
			//increasing the index after reading the line
			index++;
			//storing the all value to string 
			//from string array using index no of array
			String lastName = array[0];
			String firstName=array[1];
			String address = array[2];
			String clientId = array[3];
			int no_of_visiters = Integer.parseInt(array[4]);
			String balane = array[5];
			int no_of_pets = Integer.parseInt(array[6]);
			//here creating the no of dogs 
			//same as written in file at last off line
			Pet pets[] = new Pet[no_of_pets];
			//running the loop equal to no of
			//pets object required
			for(int i=0;i<no_of_pets;i++){
				//spiliting the pet info line into 
				//wordds using split passing the , delimeter
				String []petArray = fileInfo.get(index).split(",");
				//after getting the line increasing the index
				//so it will fetch new line on next go
				index++;
				//getting out all the values rfom string 
				//and storing to  each dif string
				String petName=petArray[0];
				String animalType = petArray[1];
				String weight = petArray[2];
				String last_rabies = petArray[3];
				String last_visit_date = petArray[4];
				//after getting all the values 
				//simply passing to pet constructor
				Pet pet = new Pet(petName,animalType,weight,last_rabies,last_visit_date);
				pets[i] = pet;
			}
			//once get all the pet now calling the 
			//client constructor by passing all
			//the required variable 
			Client client = new Client(lastName,firstName,address,clientId,balane
											,no_of_visiters,pets);
			//adding the client to client array
			_arrayOfClients[j++]=client;
			
		}
		//after getting all the value 
		//using for each loop printing
		//the value of client along with
		//pet info to console
		for(Client clientObject: _arrayOfClients){
			System.out.println(clientObject);
		}

	}

}
