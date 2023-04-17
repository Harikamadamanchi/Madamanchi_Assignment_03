package singletonExample;

public class SingletonClassExample {
	 private static SingletonClassExample sSoleInstance;

	    //private constructor.
	    private SingletonClassExample(){
	       
	        //Prevent form the reflection api.
	        if (sSoleInstance != null){
	            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
	        }
	    } 

	    public synchronized static SingletonClassExample getInstance(){
	        if (sSoleInstance == null){ //if there is no instance available... create new one
	            sSoleInstance = new SingletonClassExample();
	        }

	        return sSoleInstance;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
