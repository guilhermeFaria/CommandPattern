package br.com.hyper.estagio.ExampleCommand;
/**
 *
 * @author Guilhere Faria
 *
 * @Version 1.0 14 de nov de 2016
 */
public class RemoteControl {
	private final Command noCommand;
	private final Command[] onCommands;
	private final Command[] offCommands;
	
	public RemoteControl() {
		noCommand = new NoCommand();
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(final int slot, final Command onCommand, final Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(final int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(final int slot) {
		offCommands[slot].execute();
	}
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n----- Remote Control -----\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "]" + onCommands[i].getClass().getName()+ " "+offCommands[i].getClass().getName()+"\n");
		}
		return stringBuff.toString();
	}
	
}