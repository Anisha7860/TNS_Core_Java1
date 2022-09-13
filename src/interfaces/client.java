package interfaces;

public class client {
	public static void main(String[] args) {
		animal animal1=new tiger();
		animal1.eat();
		animal1.makesSound();
		
		animal animal2=new cow();
		animal2.eat();
		animal2.makesSound();

	}

}
