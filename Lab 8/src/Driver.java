/**
public class Driver {

	public static void main(String[] args) 
	{
		BoardGame monopoly = new BoardGame();
		boolean ifAdded = true;
		GamePiece gp = GamePiece.BLUE_BOOT;
		Location l = Location.BALLROOM;
		ifAdded = monopoly.addPlayer("Christian", gp, l);
		
		System.out.println(ifAdded);
		
		
	}
}
*/
