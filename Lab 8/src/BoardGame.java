import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		
	}
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		
		//create boolean variable to return
		boolean tooMany;
		
		//proceed with adding player to game piece
		playerPieces.put(playerName, gamePiece);
		
		//if game piece already has player attached, remove the player from game piece and return false
		if (playerPieces.containsValue(gamePiece)) {
			playerPieces.remove(playerName, gamePiece);
			tooMany = false;
		}
		
		//if game piece is not associated to another player, proceed with assigning location
		else {
			playerLocations.put(playerName, initialLocation);
			tooMany = true;
		}
		return tooMany;
	}
	public GamePiece getPlayerGamePiece(String playerName) 
	{
		//return game piece that String playerName is associated with
		return playerPieces.get(playerName);
	}
	public String getPlayerWithGamePiece(GamePiece gamePiece) 
	{
		String temp = null;
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) {
			if (entry.getValue().equals(gamePiece)) {
				temp = entry.getKey();
			}
		}
		
		return temp;
	}
}
