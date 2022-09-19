package interfaces;

public class tiger implements animal {

	@Override
	public void eat() {
		System.out.println("Tiger eats meat, it carnivorous animal");
		
	}

	@Override
	public void makesSound() {
		System.out.println("Tiger roars");	
	} 

}