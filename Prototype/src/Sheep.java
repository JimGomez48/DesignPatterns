
public class Sheep implements Animal{
	
	public Sheep(){
		System.out.println("Sheep made");
	}
	
	@Override
	public String toString() {
		return "Baaaaah";		
	}

	@Override
	public Animal makeClone() {		
		Sheep sheep = null;
		System.out.println("Sheep clone is being made");
		
		try {
			sheep = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {			
			e.printStackTrace();
		}
		
		return sheep;
	}

	

}
