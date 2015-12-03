package code;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class SaveFile {
	private BufferedWriter out;
	private Board _board;
	public SaveFile(Board b)
	{
		_board=b;
	}
	public void saveToFile(int slot)
	{
		System.out.println("here");
		if(slot==1)
		{
			try
			{
				out = new BufferedWriter(new FileWriter("SaveFile.csn"));
				
				//line1 [player,color,score] all done don't touch matt or dan
				for(int i =0;i<_board.getPlayers().size();i++)
				{
					out.write("["+_board.getPlayers().get(i) +","+ getColor(i) +","+ _board.get_playersScore().get(i)+"]");
					if(i<_board.getPlayers().size()-1)
					{
						out.write(",");
					}
				}
				out.newLine();
				
				//line2 Tiles that have been placed, rotation, location and meeple placement  RD1(1,0)[Amy,12]
				// line 2 is done Matt and Dan don't touch I mean it
				Tile[][] tiles =_board.get_board();
				for(int i = 0; i<tiles.length;i++){
					for (int j = 0; j<tiles[i].length;j++){
						if(tiles[i][j]!= null){
							out.write(tiles[i][j].getId()+tiles[i][j].getRotationIndex()+"("+i+","+j+")");
							if (tiles[i][j].getFollowerSpot()!=13)
							{
								
								out.write("["+tiles[i][j].get_followerName()+","+tiles[i][j].getFollowerSpot()+"]");
							}
						}
					}
				}
				
				
				
				//line3 list of tiles left in the "deck" RA,F,D,E,X,.. 
				//for the normal tile deck
				for(Tile t :_board.getTileStack().getTileList())
				{
					out.write(t.getId()+t.getRotationIndex()+",");
				}
				out.newLine();
				out.close();
				
				//for the river tile deck
				for(Tile t :_board.getTileStack().getRiverTileList())
				{
					out.write(t.getId()+t.getRotationIndex()+",");
				}
				out.newLine();
				out.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public Color getColor(int p) {
		 
				if(p == 0){
					return Color.BLUE;
				}
				if (p == 1){
					return Color.RED;
				}
				if (p == 2){
					return Color.green;
				}
				if (p == 3) {
					return Color.YELLOW;
				}
				else  {
					return Color.BLACK;
				}
				
	}

}
