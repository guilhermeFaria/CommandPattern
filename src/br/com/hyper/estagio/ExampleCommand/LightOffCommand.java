package br.com.hyper.estagio.ExampleCommand;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		
		light.off();

	}
}
