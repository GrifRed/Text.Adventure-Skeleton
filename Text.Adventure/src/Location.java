
import java.util.*;

public class Location
	{
	private String description;
	private String title;
	private Vector<Exit> exits;
	Monster	lair;

	public Location (String t, String d)
		{
		title = t;
		description = d;
		exits = new Vector<Exit>(0);
		}
	public String getDescription()
		{
		return description;
		}
	public String getTitle()
		{
		return title;
		}
	public void addExit(Exit exit)
		{
		exits.addElement(exit);
		}
	public Vector<Exit> getExits()
		{
		return exits;
		}
	public Monster getLair()
		{
		return lair;
		}
	}
