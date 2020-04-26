package pattern05_CommandPattern;

import java.util.ArrayList;

public class WaitorInvoker {
	private ArrayList<Command> commands = null;
	public WaitorInvoker() {
		commands = new ArrayList<Command>();
	}
	
	public void SetCommand(Command cmd) {
		commands.add(cmd);
	}
	
	public void OrderUp() {
		System.out.println("您有新的订单！");
		for(Command cmd : commands) {
			if(cmd != null)
				cmd.execute();
		}
	}
}
