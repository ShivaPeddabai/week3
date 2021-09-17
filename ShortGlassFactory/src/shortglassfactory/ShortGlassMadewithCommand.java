package shortglassfactory;

public class ShortGlassMadewithCommand implements Command{
	ShortGlassFactory shortGlassFactory;
	public ShortGlassMadewithCommand(ShortGlassFactory shortGlassFactory)
	{
		this.shortGlassFactory = shortGlassFactory;
	}
	@Override
	public void execute() {
		shortGlassFactory.madeOf();		
	}
}
