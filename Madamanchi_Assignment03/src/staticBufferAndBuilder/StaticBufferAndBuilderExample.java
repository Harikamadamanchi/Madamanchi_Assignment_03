package staticBufferAndBuilder;

public class StaticBufferAndBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder Builder = new StringBuilder();
		StringBuffer Buffer = new StringBuffer();

		// Append strings to StringBuilder and StringBuffer
		Builder.append("Hello");
		Buffer.append("Hello");

		// Print the content of both StringBuilder and StringBuffer
		System.out.println("StringBuilder: " + Builder.toString());
		System.out.println("StringBuffer: " + Buffer.toString());

	}

}
