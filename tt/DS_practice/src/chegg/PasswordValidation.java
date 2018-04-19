package chegg;

public class PasswordValidation {
	
public static String checkPassword(String password){
		
		String good="Password OK";
		String notGood = "Password does not conform to the policy.";
		boolean valid = true;
		boolean flag  = true;
		//here i am checking the min 8 char and max 20 char in string
		//you can modify them as your best  needed
		while(valid&&flag){
			if (password.length() > 20 || password.length() < 8)
            {
                    //System.out.println("Password should be less than 15 and more than 8 characters in length.");
                    valid = false;
                    return notGood;
            }
            //checking for uppercase
            String upperCaseChars = "(.*[A-Z].*)";
            if (!password.matches(upperCaseChars ))
            {
                    //System.out.println("Password should contain atleast one upper case alphabet");
                    valid = false;
                    return notGood;
            }
            //checking for one digit
            String numbers = "(.*[0-9].*)";
            if (!password.matches(numbers ))
            {
                    //System.out.println("Password should contain atleast one number.");
                    valid = false;
                    return notGood;
                   
            }
            //if all goes well then breaking the while loop by setting the 
            //flag = false;
            if(valid){
            	
            	flag = false;
            }
           
            
            
		}
		return good;

}

	public static void main(String[] args) {
		
		System.out.println(checkPassword(args[0]));
		
		
	}
	
}