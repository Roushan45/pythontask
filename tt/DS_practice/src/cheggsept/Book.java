package cheggsept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Serializable book class
 * @author Admin
 *
 */
public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	//book properties
	private String title;
	private int number_in_store;
	private float price;
	
	//setters and getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber_in_store() {
		return number_in_store;
	}

	public void setNumber_in_store(int number_in_store) {
		this.number_in_store = number_in_store;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	//to string method
	public String toString()
	{
		return "Book Name : "+title+" | No of units : "+number_in_store+" Price : "+price;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//book array
		ArrayList<Book>bookArray = new ArrayList<>();
		String fileName="";
		int bookCount=0;
		System.out.println("Enter the name of file that you want to read ");
		fileName = sc.next();
		File readfile = new File(fileName);
		if(!readfile.exists())
			System.out.println("File not found");
		else{
			try
	        {   
	           //reading binary file
	            FileInputStream file = new FileInputStream(fileName);
	            ObjectInputStream in = new ObjectInputStream(file);
	             in.defaultReadObject();
	           //desirializing the object
	            bookArray = (ArrayList<Book>) in.readObject();
	             
	            in.close();
	            file.close();
	             
	            System.out.println("File has been read ");
	         
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("Exception is caught");
	        }
	         
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
		}
		while(true)
		{
			//menu for user
			System.out.println("1. Add book\n2. lookin the book by title \n3. Add copies of existing book to store"
					+ "\n4. List all book in store \n5. Quit and save to file ");
			int choice = sc.nextInt();
			if(choice==1)
			{
				//adding  book to arraylist 
				Book newbook  = new Book();
				System.out.println("Enter the title ");
				String title = sc.next();
				System.out.println("Enter the number of units to add ");
				int units = sc.nextInt();
				System.out.println("Enter the price");
				float price = sc.nextFloat();
				newbook.setTitle(title);
				newbook.setPrice(price);
				newbook.setNumber_in_store(units);
				System.out.println("Book added successfully");
				bookArray.add(newbook);
				bookCount++;
			}
			else if(choice == 2)
			{
				//searching by book title
				System.out.println("Enter the book title : ");
				String title = sc.next();
				System.out.println("Searching title in store .....");
				boolean flag=false;
				for(int i=0;i<bookCount;i++)
				{
					//if book found
					if(bookArray.get(i).getTitle().equalsIgnoreCase(title))
					{
						flag=true;
						System.out.println("Result found for book ");
						System.out.println(bookArray.get(i).getTitle()+" Price "+bookArray.get(i).getPrice());
						System.out.println("Do you want to buy this (y/n)");
						String temp = sc.next();
						if(temp.equalsIgnoreCase("y"))
							//checking if have enough book to sell
							if(bookArray.get(i).getNumber_in_store()<1)
							{
								System.out.println("Currently book not available ");break;
							}
							else{//decreasing the count once user buys
								bookArray.get(i).setNumber_in_store(bookArray.get(i).getNumber_in_store()-1);
								break;
							}
					}
				}//if book not found
				if(!flag)
					System.out.println("Book not found");
			}
			else if(choice==3)
			{//adding copies to existing book
				System.out.println("Enter the book title that want to add copies ");
				String title = sc.next();
				boolean flag = false;
				for(int i=0;i<bookCount;i++)
				{//searching for existing book
					if(bookArray.get(i).getTitle().equalsIgnoreCase(title))
					{
						flag=true;
						System.out.println("Enter the number of copies ");
						int num  = sc.nextInt();
						bookArray.get(i).setNumber_in_store(bookArray.get(i).getNumber_in_store()+num);
						break;
					}
				}//if book not found
				if(!flag)
					System.out.println("Book not found");
			}//printing the book from array
			else if(choice==4)
			{
				for(int i=0;i<bookCount;i++)
				{
					System.out.println(bookArray.get(i));
				}
			}//exiting and saving the data to file
			else if(choice==5)
			{
				System.out.println("Enter the file name that you want to save binary ");
				fileName = sc.next();
				try
		        {   
		            //Saving of object in a file
		            FileOutputStream file = new FileOutputStream(fileName);
		            ObjectOutputStream out = new ObjectOutputStream(file);
		             
		            /* for serialization of book array t*/
		            out.writeObject(bookArray);
		             
		            out.close();
		            file.close();
		             
		            System.out.println("Written Successfully");
		 
		        }
		         
		        catch(IOException ex)
		        {
		            System.out.println("IOException is caught");
		        }
				System.exit(0);
			}
				
			else
				System.out.println("Invalid selection ! please try again");
		}
	}
}
