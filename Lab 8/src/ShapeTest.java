import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

public class ShapeTest 
{

	@Test
	public void shapeTest() 
	{
		Shape shape = null;
		shape = Shape.BOOT;
		Assert.assertEquals("Incorrect shape value", Shape.BOOT, Shape.valueOf("BOOT"));
		
		Shape shape1 = null;
		shape1 = Shape.RACECAR;
		Assert.assertEquals("Incorrect shape value", Shape.RACECAR, Shape.valueOf("RACECAR"));
		
		Shape shape2 = null;
		shape2 = Shape.THIMBLE;
		Assert.assertEquals("Incorrect shape value", Shape.THIMBLE, Shape.valueOf("THIMBLE"));
		
		//toString method testing
		String test = shape2.toString();
		Assert.assertEquals("Incorrect toString statement", "thimble", shape2.toString());
	}

	@Test
	public void colorTest() 
	{
		
		Color color = null;
		color = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value in color" + color.name(), 0, color.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color.name(), 0, color.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color.name(), 255, color.getB());
		
		Color color1 = null;
		color1 = Color.CYAN;
		Assert.assertEquals("Incorrect rgb value in color" + color1.name(), 0, color1.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color1.name(), 255, color1.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color1.name(), 255, color.getB());
		
		Color color2 = null;
		color2 = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value in color" + color2.name(), 0, color2.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color2.name(), 255, color2.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color2.name(), 0, color2.getB());
		
		Color color3 = null;
		color3 = Color.RED;
		Assert.assertEquals("Incorrect rgb value in color" + color3.name(), 255, color3.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color3.name(), 0, color3.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color3.name(), 0, color3.getB());
		
		Color color4 = null;
		color4 = Color.MAGENTA;
		Assert.assertEquals("Incorrect rgb value in color" + color4.name(), 255, color4.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color4.name(), 0, color4.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color4.name(), 255, color4.getB());
		
		Color color5 = null;
		color5 = Color.YELLOW;
		Assert.assertEquals("Incorrect rgb value in color" + color5.name(), 255, color5.getR());
		Assert.assertEquals("Incorrect rgb value in color" + color5.name(), 255, color5.getG());
		Assert.assertEquals("Incorrect rgb value in color" + color5.name(), 0, color5.getB());
	}
	
	@Test
	public void locationTest()
	{
		Location location = null;
		location = Location.BALLROOM;
		Assert.assertEquals("Location enum value incorrect", Location.BALLROOM, Location.valueOf("BALLROOM"));
		
		Location location1 = null;
		location1 = Location.BILLIARD_ROOM;
		Assert.assertEquals("Location enum value incorrect", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
		
		Location location2 = null;
		location2 = Location.CONSERVATORY;
		Assert.assertEquals("Location enum value incorrect", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		
		Location location3 = null;
		location3 = Location.DINING_ROOM;
		Assert.assertEquals("Location enum value incorrect", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		
		Location location4 = null;
		location4 = Location.HALL;
		Assert.assertEquals("Location enum value incorrect", Location.HALL, Location.valueOf("HALL"));
		
		Location location5 = null;
		location5 = Location.KITCHEN;
		Assert.assertEquals("Location enum value incorrect", Location.KITCHEN, Location.valueOf("KITCHEN"));
		
		Location location6 = null;
		location6 = Location.STUDY;
		Assert.assertEquals("Location enum value incorrect", Location.STUDY, Location.valueOf("STUDY"));
		
		Location location7 = null;
		location7 = Location.LIBRARY;
		Assert.assertEquals("Location enum value incorrect", Location.LIBRARY, Location.valueOf("LIBRARY"));
		
		Location location8 = null;
		location8 = Location.LOUNGE;
		Assert.assertEquals("Location enum value incorrect", Location.LOUNGE, Location.valueOf("LOUNGE"));
	}
	
	@Test
	public void gamePieceTest()
	{
		GamePiece gamepiece = null;
		gamepiece = GamePiece.BLUE_BOOT;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.BLUE_BOOT, GamePiece.valueOf("BLUE_BOOT"));
		
		GamePiece gamepiece1 = null;
		gamepiece1 = GamePiece.BLUE_RACER;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.BLUE_RACER, GamePiece.valueOf("BLUE_RACER"));
		
		GamePiece gamepiece2 = null;
		gamepiece2 = GamePiece.GREEN_BOOT;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.GREEN_BOOT, GamePiece.valueOf("GREEN_BOOT"));
		
		GamePiece gamepiece3 = null;
		gamepiece3 = GamePiece.MAGENTA_RACER;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.MAGENTA_RACER, GamePiece.valueOf("MAGENTA_RACER"));
		
		GamePiece gamepiece4 = null;
		gamepiece4 = GamePiece.RED_RACER;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.RED_RACER, GamePiece.valueOf("RED_RACER"));
		
		GamePiece gamepiece5 = null;
		gamepiece5 = GamePiece.RED_THIMBLE;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.RED_THIMBLE, GamePiece.valueOf("RED_THIMBLE"));
		
		GamePiece gamepiece6 = null;
		gamepiece6 = GamePiece.YELLOW_BOOT;
		Assert.assertEquals("GamePiece enum values incorrect", GamePiece.YELLOW_BOOT, GamePiece.valueOf("YELLOW_BOOT"));
		
		//getColor method testing
		Assert.assertEquals("Incorrect color value for GamePiece enum", GamePiece.YELLOW_BOOT.getColor(), gamepiece6.getColor());
		
		//getShape method testing
		Assert.assertEquals("Incorrect chape value for GamePiece enum", GamePiece.YELLOW_BOOT.getShape(), gamepiece6.getShape());
		
		//movesFirst method testing
		Assert.assertEquals("Incorrect priorities for GamePiece enum values", GamePiece.RED_RACER, GamePiece.YELLOW_BOOT.movesFirst(gamepiece6, gamepiece4));
		Assert.assertEquals("Incorrect priorities for GamePiece enum values", GamePiece.RED_RACER, GamePiece.YELLOW_BOOT.movesFirst(gamepiece4, gamepiece6));
	}
	
	@Test
	public void boardGameTest()
	{
		BoardGame bg = new BoardGame();
		
		//addPlayer method testing
		Assert.assertEquals("Incorrect boolean value for addPlayer method returned", true, bg.addPlayer("Christian", GamePiece.BLUE_BOOT, Location.BALLROOM));
		Assert.assertEquals("Incorrect boolean value for addPlayer method returned", false, bg.addPlayer("Christian", GamePiece.BLUE_BOOT, Location.BALLROOM));
		
		//getPlayerGamePiece method testing
		Assert.assertEquals("Incorrect GamePiece value for getPlayerGamePiece method returned", GamePiece.BLUE_BOOT, bg.getPlayerGamePiece("Christian"));
		
		//getPlayerWithGamePiece method testing
		Assert.assertEquals("Incorrect String value returned for getPlayerWithGamePiece method returned", "Christian", bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		Assert.assertEquals("Incorrect String value returned for getPlayerWithGamePiece method returned", null, bg.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		
		//movePlayer method testing and getPlayersAtLocation method testing
		bg.movePlayer("Christian", Location.BILLIARD_ROOM);
		ArrayList<String> temp = new ArrayList<String>();
		temp.add("Christian");
		
		Assert.assertEquals("Incorrect location", temp, bg.getPlayersAtLocation(Location.BILLIARD_ROOM));
		
		ArrayList<String> temp1 = new ArrayList<String>();
		
		Assert.assertEquals("Incorrect location", temp1, bg.getPlayersAtLocation(Location.CONSERVATORY));
		
		//moveTwoPlayers method testing
		bg.addPlayer("Michael", GamePiece.RED_RACER, Location.HALL);
		
		String[] movetest = new String[2];
		movetest[0] = "Christian";
		movetest[1] = "Michael";
		
		Location[] movelocations = new Location[2];
		movelocations[0] = Location.LIBRARY;
		movelocations[1] = Location.STUDY;
		
		String[] expected = new String[2];
		expected[0] = "Michael";
		expected[1] = "Christian";
		Assert.assertEquals(expected, bg.moveTwoPlayers(movetest, movelocations));
		
		Location[] movelocations1 = new Location[2];
		movelocations1[0] = Location.CONSERVATORY;
		movelocations1[1] = Location.LOUNGE;
		Assert.assertEquals(expected, bg.moveTwoPlayers(expected, movelocations1));
		
		//getPlayersLocation method testing
		Assert.assertEquals("Incorrect Location value returned from method", Location.LOUNGE, bg.getPlayersLocation("Christian"));
		
		//getGamePiecesAtLocation method testing
		ArrayList<GamePiece> tester = new ArrayList<GamePiece>();
		tester.add(GamePiece.RED_RACER);
		Assert.assertEquals("Incorrect GamePiece(s) value returned from method", tester, bg.getGamePiecesAtLocation(Location.CONSERVATORY));
		
		//getPlayers method testing
		Set<String> temp0 = new HashSet<String>();
		temp0.add("Christian");
		temp0.add("Michael");
		Assert.assertEquals("Incorrect return value for method", temp0, bg.getPlayers());
		
		//getPlayerLocations method testing
		Set<Location> temp01 = new HashSet<Location>();
		temp01.add(Location.CONSERVATORY);
		temp01.add(Location.LOUNGE);
		Assert.assertEquals("Incorrect return value for method", temp01, bg.getPlayerLocations());
		
		//getPlayerPieces method testing
		Set<GamePiece> temp02 = new HashSet<GamePiece>();
		temp02.add(GamePiece.RED_RACER);
		temp02.add(GamePiece.BLUE_BOOT);
		Assert.assertEquals("Incorrect return value for method", temp02, bg.getPlayerPieces());
	}
}
