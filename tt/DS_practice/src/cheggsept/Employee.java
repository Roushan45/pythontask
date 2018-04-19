package cheggsept;
//implemented the both interfaces
public class Employee implements Displayable,DepartmentConstants{
    private int department;
    private String firstName;
    private String lastName;
    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
   // add method from displayable
	@Override
	public String getDisplayText() {
		return firstName+" "+lastName+" ("+DepartmentConstants.department.values()[department-1]+")";
	}
}