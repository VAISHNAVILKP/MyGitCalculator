package Interface;

//public interface Calculator {
	public interface Calculator {
		
		
		public default int mul(int x, int y) {
			return x*y;
		}
		
		public default int div(int c, int d) {
			return c/d;
		}
		
	}

