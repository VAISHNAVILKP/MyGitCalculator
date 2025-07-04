package Test;

import Interface.Calculator;
import InterfaceImpl.CalulatorImpl;
public class Main {

	public static void main(String[] args) {
		Calculator c = new CalulatorImpl();
		int sum = c.sum(12, 12);
		System.out.println(sum);
		
		Calculator c1 = new CalulatorImpl(); 
		int sub = c1.sub(10,8);
		System.out.println(sub);
		

	}

}
