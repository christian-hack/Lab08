public enum Color 
{
	//initializing constants
	RED(255, 0, 0),
	GREEN(0, 255, 0),
	BLUE(0, 0, 255),
	YELLOW(255, 255, 0),
	CYAN(0, 255, 255),
	MAGENTA(255, 0, 0);
	
	//variables for arguments of constants
	private final int r;
	private final int g;
	private final int b;
	
	//Constructor
	Color(int red, int green, int blue) 
	{
		this.r = red;
		this.g = green;
		this.b = blue;
	}

	//Getter's
	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}
}
