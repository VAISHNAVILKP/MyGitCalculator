package Test;

import Interface.Calculator;
import InterfaceImpl.CalulatorImpl;
public class Main {

	public static void main(String[] args) {
		Calculator c = new CalulatorImpl();
		int sum = c.sum(12, 12);
		System.out.println(sum);

	}

}
