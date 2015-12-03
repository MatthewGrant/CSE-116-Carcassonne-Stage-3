package code;

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
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	public void readLine1(String s){
		String player ="";
		String color = "";
		String score = "";
		ArrayList<String> list = new ArrayList<String>();
		int state = 0;
		
		
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
			list.add(player);
			
			break;
		}
		
		}
		
		
	}

}
