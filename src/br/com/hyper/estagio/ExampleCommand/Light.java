package br.com.hyper.estagio.ExampleCommand;
/**
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 14 de nov de 2016
 */
public class Light {

	private final String location;
	
	public Light(final String location) {
		this.location = location;	
	}
	
	public String getLocation() {
		return location;
	}
	
	public void on() {
		System.out.println("Light is on in "+location);
	}
	
	public void off() {
		System.out.println("Light is off in "+location);
	}
}
