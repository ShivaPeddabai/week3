package shortglassfactory;

public class ShortGlassShapeCommand implements Command{
	ShortGlassFactory shortGlassFactory;
	public ShortGlassShapeCommand(ShortGlassFactory shortGlassFactory)
	{
		this.shortGlassFactory = shortGlassFactory;
	}
	@Override
	public void execute() {
		shortGlassFactory.shape();
	}
}