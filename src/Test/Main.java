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
		
		Calculator c2 = new CalulatorImpl(); 
		int mul = c2.mul(10,8);
		System.out.println(mul);
		
		Calculator c3 = new CalulatorImpl();
		int div = c3.div(10, 5);
		System.out.println(div);
		
	}

}
