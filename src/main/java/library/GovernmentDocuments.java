package library;

public class GovernmentDocuments extends Item{
	private boolean publicallyAccessible = false;
	public GovernmentDocuments()
	{
		super("Classified", "Classified" , 15);
	}
	public boolean isPublicallyAccessible() {
		return publicallyAccessible;
	}
	public void setPublicallyAccessible(boolean publicallyAccessible) {
		this.publicallyAccessible = publicallyAccessible;
	}
}
