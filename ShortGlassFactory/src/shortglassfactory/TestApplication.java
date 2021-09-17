package shortglassfactory;

public class TestApplication {

	public static void main(String[] args) {
		CommandInvoker invoker = new CommandInvoker();
		ShortGlassFactory shortGlassFactory = new ShortGlassFactory();
		
		invoker.setCommand(new ShortGlassMadewithCommand(shortGlassFactory));
		invoker.executeCommand();
		
		invoker.setCommand(new ShortGlassServedForCommand(shortGlassFactory));
		invoker.executeCommand();
		
		invoker.setCommand(new ShortGlassShapeCommand(shortGlassFactory));
		invoker.executeCommand();
	}
}
