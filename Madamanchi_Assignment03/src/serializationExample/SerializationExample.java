package serializationExample;

import java.io.Serializable; 

public class SerializationExample implements Serializable{
	 int id;  
	 String name;  
	 public SerializationExample(int id, String name) {  
	  this.id = id;  
	  this.name = name;  
	 }  
}
