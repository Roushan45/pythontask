package cheggsept;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String,String> map1 = new HashMap<>();
		HashMap<String,String> map2 = new HashMap<>();
		
		//System.out.println(map1);
		ArrayList<String> list1 = new ArrayList<>();	ArrayList<String> list2 = new ArrayList<>();
		//System.out.println(list1);
		//System.out.println(map1);
	//	System.out.println(list1);
		map1.put("Marty","Stepp");
		map1.put("Cynthia","Lee");
		map1.put("Keith","Schwarz");
		map1.put("Bruce","Lee");
		map1.put("Mehran","Sahami");
		list1.add("Cynthia");
		list1.add("Bruce");
		list1.add("Lee");
		list1.add("Eric");
		list1.add("Schwarz");
		list1.add("Keith");
		list1.add("Sahami");
		
		map2.put("dog","woof");
		map2.put("cat","meow");
		map2.put("horse","whinny");
		map2.put("frog","ribbit");
		map2.put("duck","dog");
		list2.add("dog");
		list2.add("horse");
		list2.add("dog");
		list2.add("woof");
		list2.add("meow");
		list2.add("cat");
		list2.add("meow");
		list2.add("woof");
		collectionMystery4(map1, list1);
		collectionMystery4(map2, list2);
	}
	
	public static void collectionMystery4(HashMap<String,String> map, ArrayList<String> list)
	{
		HashMap<String,String>result = new HashMap<String,String>();
		for(int i=0;i<list.size();i++)
		{
			String s = list.get(i);
			if(result.containsKey(s)){
				result.put(s,result.get(s)+result.get(s));
			}else if(map.containsKey(s)){
				result.put(map.get(s),s);
			}
		}
		System.out.println(result);
	}

}
