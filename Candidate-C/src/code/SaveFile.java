package code;

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
				//line1 [player,color,score]
				for(int i =0;i<_board.getPlayerNames().size();i++)
				{
					out.write(_board.getPlayerNames().get(i));
					if(i<_board.getPlayerNames().size()-1)
					{
						out.write(",");
					}
				}
				out.newLine();
				//line2 Tiles that have been placed, rotation, location and meeple placement  RD1(1,0)[Amy,12]
				//line3 list of tiles left in the "deck" RA,F,D,E,X,.. 
				for(Tile t :_board.getTileStack().getTileList())
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

}
