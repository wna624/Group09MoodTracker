package application;

public class Mood {
	private String moodTitle; //a name for the mood, ex: "happy", "angry", "depressed", etc
	private int happinessScale; //a number from 1 to 5 (we'll implement a check for this) that describes how positive the mood is
	
	//constructor
	public Mood(String title, int happiness) {
		this.moodTitle = title;
		this.happinessScale = happiness;
	}
	
	//setters
	public void setMood(String mood) {this.moodTitle = mood;}
	public void setHappiness(int happiness) {this.happinessScale = happiness;}
	
	//getters
	public String getMood() {return moodTitle;}
	public int getHappiness() {return happinessScale;}
	
}
