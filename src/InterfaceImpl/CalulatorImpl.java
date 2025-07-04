package InterfaceImpl;

import Interface.Calculator;
public class CalulatorImpl implements Calculator{
	
	//@Override
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
		}
	
	public int sub(int x, int y) {
		int sub = x-y;
		return sub;
	}

}
