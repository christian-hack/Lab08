
public enum GamePiece 
{

	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 3),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 7),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 10);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	GamePiece(GamePieceAppearance app, int pri) 
	{
		this.appearance = app;
		this.priority = pri;
	}
	public Color getColor() 
	{
		return appearance.getColor();
	}
	public Shape getShape() 
	{
		return appearance.getShape();
	}
	public static GamePiece movesFirst(GamePiece a, GamePiece b) 
	{
		if (a.priority < b.priority) 
		{
			return a;
		}
		else 
		{
			return b;
		}
		
	}
	public String toString() 
	{
		return String.format("%s: a %s %s with priority %d", this.name(), this.getColor(), this.getShape(), this.priority);
	}
}
