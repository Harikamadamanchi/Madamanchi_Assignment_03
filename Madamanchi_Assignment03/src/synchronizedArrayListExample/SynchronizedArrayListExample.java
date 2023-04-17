package synchronizedArrayListExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		 
        list.add("Missouri");
        list.add("Kansas");
        list.add("City");
 
        synchronized(list)
        {
            // must be in synchronized block
            Iterator<String> it = list.iterator();
 
            while (it.hasNext()) {
            	System.out.println(it.next());
            }
                
        }

	}

}
