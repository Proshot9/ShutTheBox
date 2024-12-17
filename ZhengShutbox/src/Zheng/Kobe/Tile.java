package Zheng.Kobe;

public class Tile {
	private int value;
	private boolean isUp;
	private boolean selected;
	
	Tile(int n){
		value = n;
		isUp = true;
		selected = false;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isUp() {
		return isUp;
	}
	
	public void putDown() {
		isUp = false;
	}
	public void putUp() {
		isUp = true;
	}
	
	public boolean selected() {
		return selected;
	}
	public void select() {
		selected = true;
	}
	public void deselect() {
		selected = false;
	}

	
	@Override
	public String toString() {
		String response = "";
		if (isUp) {
			response = "" + value + "(U) ";
		}
		else {
			response = "" + value + "(D) ";			
		}
		return response;
	}
}

