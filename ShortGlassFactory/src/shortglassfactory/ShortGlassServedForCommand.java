package shortglassfactory;

public class ShortGlassServedForCommand implements Command{
	ShortGlassFactory shortGlassFactory;
	public ShortGlassServedForCommand(ShortGlassFactory shortGlassFactory)
	{
		this.shortGlassFactory = shortGlassFactory;
	}
	@Override
	public void execute() {
		shortGlassFactory.servedFor();		
	}
}