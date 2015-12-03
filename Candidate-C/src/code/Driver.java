package code;

import java.util.ArrayList;

/**
 * The Driver initiates the program by running the command line inputs and creating the Board class.
 * 
 * @author Maggie
 */
public class Driver {

	
	/**
	 * The main method allows the game code to be run as a Java Application. Holds a for loop which places the player names into the ArrayList,String> named players. Also
	 * creates the Board for actual gameplay.
	 * 
	 * @param args	The player names listed in the command line input
	 */
	public static void main(String[] args){
		ArrayList<Player> players = new ArrayList<Player>();
		if(args.length == 1){
		
			// load in Players here
			players.add(new Player("FAKE"+args[0]));
			PlayerTurns pt = new PlayerTurns(players);
			pt.run();
			
		}
		else{
			for (int i=0; i<args.length; i++) {
				String playerName = args[i];
				Player player  = new Player(playerName);
				players.add(player);
			}
			
			PlayerTurns pt = new PlayerTurns(players);
			pt.run();
			
		}
		
	}
}
