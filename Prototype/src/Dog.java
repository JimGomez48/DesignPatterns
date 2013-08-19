
public class Dog implements Animal {

	public Dog(){
		System.out.println("Dog made");
	}
	
	@Override
	public String toString() {
		return "Woof!";		
	}

	@Override
	public Animal makeClone() {
		Dog dog = null;
		System.out.println("Dog clone is being made");
		
		try {
			dog = (Dog) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return dog;
	}

}
