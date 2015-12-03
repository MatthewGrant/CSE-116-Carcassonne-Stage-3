package code;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class LoadFile {
	private Board _board;
	
	
	public LoadFile(Board b, String url ){
		_board = b;
		try{
			BufferedReader reader = new BufferedReader(new FileReader(url));
			String line = reader.readLine();
			readLine1(line);
			line = reader.readLine();
			readLine2(line);
			line = reader.readLine();
			readLine3(line);
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	public void readLine1(String s){
		String player ="";
		String color = "";
		String score = "";
		ArrayList<Player> list = new ArrayList<Player>();
		int state = 0;
		
		//this was line one
		for(int i =0; i<s.length() ;i++) {
			char ch = s.charAt(i);
			
			switch(state) {
			case 0:
				if(ch == '['){
					state = 1;
				}
			
				break;
			case 1:
				if(ch ==','){
					state = 2;
					
				}
				else{
					player+= ch;
				}
				
				break;
			case 2:
				if(ch ==','){
					state = 3;
					
				}
				else{
					color+= ch;
				}
			
					break;
			case 3:
				if(ch ==']'){
					state =4;
				
				}
				else{
					score+= ch;
				}
				
				break;
			
		case 4:
			state = 0;
			Player temp = new Player(player,StringToColor(color));
			temp.set_score(Integer.parseInt(score));
			list.add(temp);
			score = "";
			player ="";
			color ="";
			break;
		}
		
		}
		
		
	}
	
	public void readLine2(String s){
		//ArrayList<Tile> tiles = new ArrayList<Tile>();
		//ArrayList<Point> p = new ArrayList<Point>();
		String x ="";
		String y ="";
		int rot = 0;
		String playerName ="";
		String locFollower ="";
		String id ="";
		int state = 0;
		TileTypes file = new TileTypes();
		
		for(int i =0; i< s.length() ;i++) {
			char ch = s.charAt(i);
			
			switch(state) {
			case 0:
				if(Character.isDigit(ch)){
					state = 1;
					rot = Integer.parseInt(""+ch);
				}
				else{
					id+=ch;
				}
			
				break;
			case 1:
				if(ch == '('){
					state = 2;
					
				}
				break;
			case 2:
				if(ch ==','){
					state = 3;
					
				}
				else{
					x+= ch;
				}
			
					break;
			case 3:
				if(ch ==')'){
					state =4;
				
				}
				else{
					y+= ch;
				}
				
				break;
			
		case 4:
			if(s.charAt(i+1)== '['){
				state =5;
				i++;
				
				
			}
			else{
				state = 7;
				
			}
			break;
		case 5:
			if(ch== ','){
				state =6;
				
			}
			else{
				playerName+=ch;
				
			}
			break;
		case 6:
			if(ch== ']'){
				state =7;
				
			}
			else{
				locFollower += ch;
				
			}
			break;
		case 7:
			
			Tile temp= file.getTileById(id);
			temp.rotate(rot);
			
			_board.forcePlaceTile(temp,Integer.parseInt(x),Integer.parseInt(y));
			Player p = _board.getPlayer(playerName);
			temp.setFollowerSpot(Integer.parseInt(locFollower), p);
			rot =0;
			id ="";
			x= "";
			y="";
			playerName ="";
			locFollower ="";
			
			
			break;
		}
			
		
		}	
		
	}
	public void readLine3(String s){
		int state =0;
		String id ="";
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		TileTypes t = new TileTypes();
		
		for(int i =0; i< s.length() ;i++) {
			char ch = s.charAt(i);
			
			switch(state) {
			case 0:
				if(ch != '0'){
					state = 1;
					
				}
				else{
					id+=ch;
				}
			
				break;
			case 1:
				if(ch == ','){
					state = 2;	
				}
				
				break;
			case 2:
				state = 0;
				tiles.add(t.getTileById(id));
				id = "";
				
			}
		}
		_board.getTileStack().set_tileList(tiles);
	}
	
	private Color StringToColor(String s){
		if(s.equals("RED")){
			return Color.RED;
			
		}
		else if(s.equals("BLUE")){
			return Color.BLUE;
			
		}	
		else if(s.equals("GREEN")){
			return Color.GREEN;
			
		}
		else if(s.equals("YELLOW")){
			return Color.YELLOW;
			
		}
		else{
			return Color.BLACK;
		}
		
	}

}
