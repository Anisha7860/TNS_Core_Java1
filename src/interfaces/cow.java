package interfaces;

public class cow implements animal{

	@Override
	public void eat() {
		System.out.println("Cow eats grass, its a herbivorous animal");
		
	}

	@Override
	public void makesSound() {
		System.out.println("Cow make Mow Mow sound");
	}

}