package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class LabyrinthBuilder {
	
	private int width;
	private int height;
	private Set<Position> forbiddenCellsPositions;
	private Position exitPosition;
	
	
	
	public LabyrinthBuilder setWwidth(int width) throws Exception 
	{
		this.width=width;
		return this;
	}
	
	public LabyrinthBuilder setHeight(int height) throws Exception 
	{
		this.height=height;
		return this;
	}
	
	public LabyrinthBuilder addForbiddenCellsPositions(Set<Position> forbiddenCellsPositions) throws Exception 
	{
		this.forbiddenCellsPositions=forbiddenCellsPositions;
		return this;
	}
	
	public LabyrinthBuilder setExitPosition(Position exitPosition) throws Exception 
	{
		this.exitPosition=exitPosition;
		return this;
	}
	
	public Labyrinth getLabyrinthBuilder() throws Exception 
	{
		
		if (this.width > 0 && this.height > 0 )
		{
			return new Labyrinth(this.width, this.height, this.forbiddenCellsPositions, this.exitPosition);
		}
		return null;
		
	}
	

}
