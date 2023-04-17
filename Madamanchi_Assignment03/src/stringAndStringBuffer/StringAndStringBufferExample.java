package stringAndStringBuffer;

public class StringAndStringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi";
		str = str.concat(" World");//using concat in Strings
		System.out.println(str); // Output: Hello World
		
		// StringBuffer example
		StringBuffer sb = new StringBuffer("Hi");
		sb.append(" World"); //using append in String buffers
		System.out.println(sb.toString()); // Output: Hello World
	}

}
