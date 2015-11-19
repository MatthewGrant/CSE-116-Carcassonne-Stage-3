package code;

import java.util.ArrayList;

import javax.swing.ImageIcon;

/**
 * The TileTypes class creates the correct number of the 24 tile types to reach a total of 71
 * Tile objects in the ArrayList<Tile> named _tileList. The starting tile is not included in this
 * list because it is initialized in the Board constructor.
 * 
 * @author Maggie
 */
public class TileTypes {
	
	/**
	 * ArrayList named _tileList which will hold all of the tiles that need to be created for gameplay
	 */
	private ArrayList<Tile> _tileList;
	
	/**
	 * Constructor initializes the _tileList as a new ArrayList<Tile>
	 */
	public TileTypes() {
		_tileList = new ArrayList<Tile>();
	}

	/**
	 * Method which creates all of the tiles in the _tileList at the start of the game. Runs a for loop
	 * which works through each tile type based on a number from 1-24. Each type number is taken into an
	 * if statement which holds the String[] for each side, the inside qualifier, a boolean which is true
	 * if a shield is present, the image based on the TileSet.jpg file which was given, and an int which 
	 * refers to a follower placement.
	 */
	//the idse are wrong
	public void createTiles() {
		for (int type = 1; type<34; type++) {
			if (type == 1) {
				for (int i=0; i<5; i++) {
					//top left bottom right
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					
					//inside must be mentioned for scoring and follower placement purposes:
					//	=field, =city, =road, =road end, =cloister
					String inside = "field";
					
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/1.png"));
					
					//all follower int values are initialized to 9 which means no follower placement
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"1");
					_tileList.add(t);
				}
			}
			if (type == 2) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/2.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"2");
					_tileList.add(t);
				}
			}
			if (type == 3) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"city", "city", "city"};
					String[] s3 = {"field", "field","field"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/3.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"3");
					_tileList.add(t);
				}
			}
			if (type == 4) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/4.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"4");
					_tileList.add(t);
				}
			}
			if (type == 5) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/5.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"5");
					_tileList.add(t);
				}
			}
			if (type == 6) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/6.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"6");
					_tileList.add(t);
				}
			}
			if (type == 7) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/7.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"7");
					_tileList.add(t);
				}
			}
			if (type == 8) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"city", "city", "city"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/8.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"8");
					_tileList.add(t);
				}
			}
			if (type == 9) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/9.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"9");
					_tileList.add(t);
				}
			}
			if (type == 10) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/10.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"10");
					_tileList.add(t);
				}
			}
			if (type == 11) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "road", "field"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/11.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"11");
					_tileList.add(t);
				}
			}
			if (type == 12) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "field", "field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/12.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"12");
					_tileList.add(t);
				}
			}
			if (type == 13) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/13.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"13");
					_tileList.add(t);
				}
			}
			if (type == 14) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/14.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"14");
					_tileList.add(t);
				}
			}
			if (type == 15) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/15.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"15");
					_tileList.add(t);
				}
			}
			if (type == 16) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/16.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"16");
					_tileList.add(t);
				}
			}
			if (type == 17) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"city", "city", "city"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"city", "city", "city"};
					String inside = "city";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/17.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, true, img, 9,"17");
					_tileList.add(t);
				}
			}
			if (type == 18) {
				for (int i=0; i<3; i++) {
					String[] s0 = {"city", "city", "city"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road end";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/18.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"18");
					_tileList.add(t);
				}
			}
			if (type == 19) {
				for (int i=0; i<4; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "cloister";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/19.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"19");
					_tileList.add(t);
				}
			}
			if (type == 20) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "cloister";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/20.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"20");
					_tileList.add(t);
				}
			}
			if (type == 21) {
				for (int i=0; i<8; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/21.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"21");
					_tileList.add(t);
				}
			}
			if (type == 22) {
				for (int i=0; i<9; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/22.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"22");
					_tileList.add(t);
				}
			}
			if (type == 23) {
				for (int i=0; i<4; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road end";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/23.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"23");
					_tileList.add(t);
				}
			}
			if (type == 24) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "road","field"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "road end";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/24.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"24");
					_tileList.add(t);
				}
			}
			
			
			/////////// river tiles
			if (type == 25) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "river","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "river end";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/25.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"25");
					_tileList.add(t);
				}
			}
			if (type == 26) {
				for (int i=0; i<2; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"field", "field","field"};
					String[] s2 = {"field", "river","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "river";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/26.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9,"26");
					_tileList.add(t);
				}
			}
			if (type == 27) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"field", "river","field"};
					String[] s2 = {"field", "field","field"};
					String[] s3 = {"field", "field","field"};
					String inside = "river";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/27.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 28) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "field","field"};
					String[] s1 = {"field", "river","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "river","field"};
					String inside = "cloister";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/28.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 29) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"field", "river","field"};
					String[] s2 = {"city", "city","city"};
					String[] s3 = {"city", "city","city"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/29.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 30) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "road","field"};
					String[] s1 = {"field", "river","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "river","field"};
					String inside = "road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/30.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 31) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"city", "city","city"};
					String[] s2 = {"field", "river","field"};
					String[] s3 = {"city", "city","city"};
					String inside = "river";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/31.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 32) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"field", "river","field"};
					String[] s2 = {"field", "road","field"};
					String[] s3 = {"field", "road","field"};
					String inside = "field";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/32.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			if (type == 33) {
				for (int i=0; i<1; i++) {
					String[] s0 = {"field", "river","field"};
					String[] s1 = {"field", "road","field"};
					String[] s2 = {"field", "river","field"};
					String[] s3 = {"city", "city","city"};
					String inside = "end road";
					ImageIcon img = new ImageIcon(getClass().getResource("/resources/33.png"));
					Tile t = new Tile(s0,s1,s2,s3, inside, false, img, 9);
					_tileList.add(t);
				}
			}
			
		}
	}
	
	/**
	 * getTileList() is an accessor method which is used to return the _tileList for use in other classes
	 * 
	 * @return	_tileList which returns an ArrayList of all of the tiles left at the time the method is called.
	 */
	public ArrayList<Tile> getTileList() {
		return _tileList;
	}		
}
