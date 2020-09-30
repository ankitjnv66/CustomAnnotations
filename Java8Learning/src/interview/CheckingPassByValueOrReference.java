package interview;


class Dog{
	private String name;

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
public class CheckingPassByValueOrReference {

	public static void main(String[] args) {
		Dog dog = new Dog("before");
		System.out.println("before calling method : "+dog.getName());
		checkRefOrValue(dog);
		System.out.println("after calling method : "+dog.getName());
		
	}
	public static void checkRefOrValue(Dog methodDog) {
		System.out.println("inside method 1: "+methodDog.getName());
		methodDog = new Dog();
		System.out.println("inside method 2: "+methodDog.getName());
		methodDog.setName("new Dog");
		System.out.println("inside method 3: "+methodDog.getName());
		
		
	}

}
