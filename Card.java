package week6;

public class Card {

	private int value; // card numbers 2-14
	private String name; //will be suit names 
			
	public Card(int value, String name) {
		this.setValue(value);
		this.setName(name);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
			System.out.println(name);
	}
	}
	

