package hashMapAndHashTableExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMapAndHashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> ha=new Hashtable<Integer,String>();
	        ha.put(101,"Aruna");
	        ha.put(101,"Mohan");
	        ha.put(102,"Sekahara");
	        ha.put(103,"Vidya");
	        System.out.println("------Hash table------");
	        for (Map.Entry m:ha.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }
	 
	        //----------------hashmap------------------------
	        HashMap<Integer,String> h=new HashMap<Integer,String>();
	        h.put(100,"Harsh");
	        h.put(104,"Harsh"); 
	        h.put(101,"Rahul");
	        h.put(102,"Ravi");
	        System.out.println("---Hash map----");
	        for (Map.Entry m:h.entrySet()) {
	            System.out.println(m.getKey()+" "+m.getValue());
	        }

	}

}
