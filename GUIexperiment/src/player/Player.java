package player;

public class Player {
	private String name;
	private int points;
	
	public Player()
	{
		name = "Player 1";
		points = 0;
	}
	
	public Player(String name)
	{
		this.name = name;
		points = 0;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
	

}
