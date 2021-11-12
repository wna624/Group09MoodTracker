package application;

import java.util.HashMap;

public class MoodTracker {
	private String username;
	private HashMap<String, Mood> moodData = new HashMap<String, Mood>(); //hashmap for storing the date and a mood object
	//note: considering using the Java utility class Date instead of a string for the date
	
	//constructor
	public MoodTracker(String username) {
		this.username = username;
	}
	
	public void addMood(String date, Mood newMood) {
		moodData.put(date, newMood);
	}
	
	//maybe we should add a way to save this data to a file with the username and then their data will be saved between sessions

}
