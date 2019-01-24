package stateandbehavior;

public class Digit {
	private int base;
	private int number;
	
	public Digit(int base) {
		this.base = base;
		this.number = 0;
	}
	
	public int getValue() {
		return this.number;
	}
	
	public boolean increment() {
		this.number++;
		if (this.number == this.base) {
			this.number = 0;
			return true;
		}
		return false;
	}
	
	public int getBase() {
		return this.base;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		char [] tabellmedtallogbokstaver = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		return String.valueOf(tabellmedtallogbokstaver[number]);
	}
	public static void main(String[] args) {
		Digit digit = new Digit(2);
		digit.increment();
		digit.increment();
		digit.increment();
		System.out.println(digit);
	}
	
}
