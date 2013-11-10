
public class Exit
	{
	public static final String north = "north";
	public static final String south = "south";
	public static final String west = "west";
	public static final String east = "east";
	private Location leadsTo;
	private String direction;
	

public Exit (String directionToMove, Location leadsToLocation)
	{
	leadsTo = leadsToLocation;
	direction = directionToMove;
	}
public Location getLeadsTo()
	{
	return leadsTo;
	}
public String getDirection()
	{
	return direction;
	}
}
