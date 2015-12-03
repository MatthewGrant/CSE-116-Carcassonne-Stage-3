package code;

import java.awt.Color;

public class Player {
	
	private String _name;
	private Color _color;
	private int _score;
	private int _numMeeples;
	private static final int MAXMEEPLES = 7;

	
	public Player(String name, Color c){
		// player class to hold the name color and  the score
		
		_name = name;
		_color = c;
		_score = 0;
		this._numMeeples = MAXMEEPLES;
		
		
	}
	
	/**
	 * overload to make other thing work
	 * @param name of the players
	 */
	public Player(String name){
		// player class to hold the name color and  the score
		
		_name = name;
		
		_score = 0;
		this._numMeeples = MAXMEEPLES;
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

	/**
	 * @param _color to set the coloer of the follower for the players
	 */
	public void set_color(Color _color) {
		this._color = _color;
	}

	  /**
	   * get numMeeples.
	   * @return numMeeples
	   */
	  public int getNumMeeples() {
	    return _numMeeples;
	  }
	  	 

	  /**
	   * set numMeeples.
	   * @param numMeeples what to set numMeeples to.
	   */
	  public void setNumMeeples(int numMeeples) {
	    this._numMeeples = numMeeples;
	  }


}
