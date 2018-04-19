package cheggmarch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Store {
	private HashMap<String, ArrayList<Worker>> workers= new HashMap<>();
	
	public void add(Worker newGuy, String department){
		ArrayList<Worker> list = new ArrayList<>();
		list.add(newGuy);
		workers.put(department, list);
	}
	
	public String departmentFor(Worker w){
		
		Iterator it = this.workers.entrySet().iterator();
	    /*while (it.hasNext()) {
	        Map.Entry <String,ArrayList<Worker>>pair = (Map.Entry)it.next();
	        ArrayList<Worker> worker = pair.getValue();
	        //System.out.println(pair.getKey() + " = " + pair.getValue());
	        //it.remove(); // avoids a ConcurrentModificationException
	        for(Worker www : worker){
	        	System.out.println("meinnnn");
	        }
	    }*/
		for (String key : workers.keySet()) {
		    System.out.println("Key = " + key);
		}
		System.out.println("nedkj");
//		if(dep==null){
//			return "Emp not work at any depart";
//		}
		return "";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker _1st = new Worker("Rakesh", 436);
		Worker _2nd = new Worker("Rtt", 3432);
		new Store().add(_1st, "Gym");
		new Store().add(_2nd, "clothing");
		
		String dep = new Store().departmentFor(_1st);
		System.out.println(dep);

	}

}
