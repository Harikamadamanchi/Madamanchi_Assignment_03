package overrideMethods;

class Parent {
    public static void foo() {
        System.out.println("Parent foo");
    }
    private void bar() {
        System.out.println("Parent bar");
    }
}
class Child extends Parent {
    public static void foo() {
        System.out.println("Child foo");
    } 
    private void bar() {
        System.out.println("Child bar");
    }
}
public class OverrideMethodsExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.foo();
		//p.bar(); 
	}
}
