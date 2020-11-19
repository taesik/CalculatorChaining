
public class Calculator {

	static class Number {
		private int value;
		
		private Number(int value) {
			this.value = value;
		}
		
		public int getNumber() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		public Number add(int i) {
			return new Number(getNumber()+i);
		}

		public Number subtract(int i) {
			return new Number(getNumber()-i);
		}
	}
	public static void main(String[] args) {
		Calculator.Number data=new Calculator.Number(0);
		
		Number result = data.add(6).add(10).subtract(5);
		System.out.println(result);
	}

}
	

