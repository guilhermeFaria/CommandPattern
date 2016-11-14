package br.com.hyper.estagio.ExampleCommand;
/**
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 14 de nov de 2016
 */
public class LightOffCommand implements Command {
	private final Light light;
	
	public LightOffCommand(final Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		
		light.off();
	}
}