package covariantExample;



class Animal {
	   public Animal getAnimal() {
		   System.out.println("SuperClass");
	      return new Animal();
	   }
	}

	class Dog extends Animal {
	   @Override
	   public Dog getAnimal() {
		   System.out.println("SubClass");
	      return new Dog();
	   }
	}
	
public class CovariantExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Animal a = dog.getAnimal(); 
		

	}

}
