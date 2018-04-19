package chegg;
public class Student extends Person {
        
    private String major;
    private int level;
    private Person obj;
    
        public Student(String id, String last, String first) {
        super(id, last, first);
        obj = new Person(id, last, first);
    }
        public Student(String id, String last, String first, String focus, int level) {
           super(id,last,first);
            this.major = focus;
            this.level = level;
            obj = new Person(id, last, first);
        }
        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;
        }
        public int getLevel() {
            return level;
        }
        public void setLevel(int level) {
            this.level = level;
        }
        public String toString(){
        	return  obj.getId()+" : firstname-> "+obj.getFirstName()+" :Lastname -> "+obj.getLastName()+
        			"  \nMajor> "+this.major+"  :Level-> "+this.level;
        }
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		Student student = new Student("alpha", "Robert", "Ven","CS",2);
    		System.out.println(student.toString());
    	}
    }

