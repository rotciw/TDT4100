package stateandbehavior;

public class Location {

	public int x;
	public int y;
	
	public void up() {
		this.y--;
	}
	
	public void down() {
		this.y++;
	}
	
	public void left() {
		this.x--;
	}
	
	public void right() {
		this.x++;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Din x pos: " + getX() + " Din y pos: " + getY();
	}
	
	public static void main(String[] args) {
		Location location = new Location();
		location.down();
		location.left();
		System.out.println(location);
	}
	
}
