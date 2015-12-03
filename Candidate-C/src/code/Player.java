package code;

import java.awt.Color;

public class Player {
	
	private String _name;
	private Color _color;
	private int _score;
	
	public Player(String name, Color c){
		// player class to hold the name color and  the score
		
		_name = name;
		_color = c;
		_score = 0;
		
		
		
	}
	
	//geter for the class

	

	/**
	 * @param _score 
	 */
	public void set_score(int _score) {
		this._score = _score;
	}
	
	/**
	 * @return gets the score for each player
	 */
	public int get_score() {
		return _score;
	}
	
	/**
	 * @return the name of the player
	 */
	public String get_name() {
		return _name;
	}

	/**
	 * @return the color of the followers that gose to each player
	 */
	public Color get_color() {
		return _color;
	}
	

}
