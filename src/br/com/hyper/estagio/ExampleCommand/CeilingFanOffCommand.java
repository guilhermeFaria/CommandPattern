package br.com.hyper.estagio.ExampleCommand;

/**
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 14 de nov de 2016
 */
public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(final CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.off();
	}

}