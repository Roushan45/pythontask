package cheggsept;
public class DisplayableTestApp {
    public static void main(String args[]) {
        System.out.println("Welcome to the Displayable Test application\n");
        //changed the type of Employee and product to displayable
        Displayable e = new Employee(2, "Smith", "John");
       // calling the method by passing object
        display(e);
        Displayable p = new Product("java", "Murach's Java Programming", 57.50);
        display(p);
        
        System.out.println();        
    }
    private static void display(Displayable d) {
        System.out.println(d.getDisplayText());
    }
}