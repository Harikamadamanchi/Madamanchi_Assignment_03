package generics;

class MyGenericClass<T> {
	private T data;

	public MyGenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
	public class GenericsExample1 {
		public static void main(String[] args) {
			MyGenericClass<Integer> g = new MyGenericClass<Integer>(42);
			System.out.println("Data stored in gObj: " + g.getData());

			MyGenericClass<String> g1 = new MyGenericClass<>("Generic Class Example");
			System.out.println("Data stored in g1Obj: " + g1.getData());
		}
	}
	
		
			
	
