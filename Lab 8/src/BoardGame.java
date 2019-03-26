import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class BoardGame 
{
	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>();
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>();
	
	public BoardGame() 
	{
		
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) 
	{
		
		//create boolean variable to return
		//boolean tooMany = false;
		
		//proceed with adding player to game piece
		//playerPieces.put(playerName, gamePiece);
		
		//if game piece already has player associated, remove the player from game piece and return false
		if (playerPieces.containsValue(gamePiece)) {
			//playerPieces.remove(playerName, gamePiece);
			return false;
		}
		
		//if game piece is not associated to another player, proceed with assigning location
		else {
			playerLocations.put(playerName, initialLocation);
			playerPieces.put(playerName, gamePiece);
			return true;
		}
		//return tooMany;
	}
	
	public GamePiece getPlayerGamePiece(String playerName) 
	{
		//return game piece that String playerName is associated with
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) 
	{
		//initialize String to be returned as null
		String temp = null;
		
		//iterate through entries to find matching game piece and assign the key associated with matching game piece to string value
		for (Entry<String, GamePiece> entry : playerPieces.entrySet()) 
		{
			if (entry.getValue().equals(gamePiece)) {
				temp = entry.getKey();
			}
		}
		
		return temp;
	}
	
	public void movePlayer(String playerName, Location newLocation) 
	{
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		String[] temp = new String[2];
		
		GamePiece temp1 = playerPieces.get(playerNames[0]);
		GamePiece temp2 = playerPieces.get(playerNames[1]);
		
		if (temp1.equals(GamePiece.movesFirst(temp1, temp2))) 
		{
			playerLocations.put(playerNames[0], newLocations[0]);
			playerLocations.put(playerNames[1], newLocations[1]);
			temp[0] = "" + playerNames[0];
			temp[1] = "" + playerNames[1];
		}
		else if (temp2.equals(GamePiece.movesFirst(temp1, temp2))) 
		{
			playerLocations.put(playerNames[1], newLocations[1]);
			playerLocations.put(playerNames[0], newLocations[0]);
			temp[0] = "" + playerNames[1];
			temp[1] = "" + playerNames[0];
		}
		return temp;
	}
	
	public Location getPlayersLocation(String player) 
	{
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc) 
	{
		ArrayList<String> temp = new ArrayList<String>();
		
		for (Entry<String, Location> entry : playerLocations.entrySet()) 
		{
			if (entry.getValue().equals(loc)) 
			{
				temp.add(entry.getKey());
			}
		}
		return temp;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) 
	{
		
		ArrayList<GamePiece> temp = new ArrayList<GamePiece>();
		
		for (Entry<String, Location> entry : playerLocations.entrySet()) 
		{
			if (entry.getValue().equals(loc)) 
			{
				temp.add(playerPieces.get(entry.getKey()));
			}
		}
		return temp;
	}
	
	public Set<String> getPlayers() 
	{
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		Set<Location> l = new HashSet<Location>();
		for (Entry<String, Location> entry : playerLocations.entrySet())
		{
			l.add(entry.getValue());
		}
		return l;
	}

	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> gp = new HashSet<GamePiece>();
		for (Entry<String, GamePiece> entry : playerPieces.entrySet())
		{
			gp.add(entry.getValue());
		}
		return gp;
	}
}
