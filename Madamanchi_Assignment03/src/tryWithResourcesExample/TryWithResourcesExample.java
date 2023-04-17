package tryWithResourcesExample;

import java.io.FileOutputStream;

public class TryWithResourcesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream newFile = new FileOutputStream("input.txt")) {
            String text= "Hello World. This is my java program";
            byte arr[] = text.getBytes();
            newFile.write(arr);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Resource are closed so the message has been written into the input.txt");

	}

}
