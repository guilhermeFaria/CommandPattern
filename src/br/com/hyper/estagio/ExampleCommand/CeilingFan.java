package br.com.hyper.estagio.ExampleCommand;

public class CeilingFan {
	
	public final int HIGH = 3;
	public final int MEDIUM = 2;
	public final int LOW = 1;
	public final int OFF = 0;
	public final String location;
	private int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
	}
	
	public void medium() {
		speed = MEDIUM;
	}
	
	public void low() {
		speed = LOW;
	}
	
	public void off() {
		speed = OFF;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void desligada() {
		System.out.println("Luz desligada");
	}
	

}
