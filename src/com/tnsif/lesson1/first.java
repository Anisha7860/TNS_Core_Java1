// java program to demonstrate naming conventions
package com.tnsif.lesson1;

abstract class Demo {
	private Integer firstNumber = 100;
	Float secondNumber = 200.0f;
	Integer SPEEDLIMIT = 80;
	/* method to calculate product of two number */
	abstract void calculateProduct();
	
}
class DemoOne extends Demo
{
	void calculateProduct()
	{
		System.out.println("Product is ");
	}
}
public class first {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first obj = new first();	
		//obj.calculateProduct();	
	}

}
// A) Simple B) Encapsulation C) Abstraction D) Inheritance
// public private protected defaultpackage com.tnsif.lesson1;