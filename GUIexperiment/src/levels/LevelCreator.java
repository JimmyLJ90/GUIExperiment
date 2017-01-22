package levels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import gameObjects.Block;

/**
 * Reads a file and creates an array of blocks
 * @author Jimmy
 *
 */
public class LevelCreator {


	private ArrayList<Block> blockLevel;
	private String levelName = null;

	public LevelCreator(String levelName)
	{
		this.levelName = levelName;
		blockLevel = new ArrayList<Block>();
	}



	public ArrayList<Block> getBlocks()
	{
		if(blockLevel.size() == 0)
			createLevel();
		return blockLevel;

	}

	private  void createLevel()
	{
		InputStream txtFile;
		BufferedReader reader;
		txtFile = this.getClass().getResourceAsStream(levelName);
		try 
		{
			reader = new BufferedReader(new InputStreamReader(txtFile,"UTF-8"));
			String line = "";
			int rowNumber = 0;
			while((line = reader.readLine()) != null)
			{
				createRow(line,rowNumber++);
			}
		} 
		catch (UnsupportedEncodingException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}
	
	private void createRow(String row, int rowNumber)
	{
		int columnNr = 0;
		for(int i = 0; i<row.length();i++)
		{
			if(row.charAt(i) == 'X' || row.charAt(i) == 'x')
			{
				createNormalBlock();
			}
		}
	}

	private void createNormalBlock()
	{

	}





}
