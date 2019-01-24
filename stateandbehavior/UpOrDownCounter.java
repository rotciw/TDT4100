package stateandbehavior;

public class UpOrDownCounter {

	private int counter;
	private int end;
	
	public UpOrDownCounter(int start, int end) {
		this.counter = start;
		this.end = end;
		if (start == end) {
			throw new IllegalArgumentException("Can't be same");
		}
	}
	
	public int getCounter() {
		return this.counter;
	}
	
	public boolean count() {
		if (this.counter > this.end) {
			this.counter = this.counter-1;
			return true;
		} else if (this.counter < this.end) {
			this.counter = this.counter+1;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nå er telleren på: " + getCounter() + count();
	}
	
	public static void main(String[] args) {
		UpOrDownCounter counter = new UpOrDownCounter(1,3);
		counter.count();
		System.out.println(counter);
		counter.count();
		System.out.println(counter);
		counter.getCounter();
		System.out.println(counter);
	}
	
}
