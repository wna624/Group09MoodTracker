package application;

public class Mood {
	private String moodTitle; //a name for the mood, ex: "happy", "angry", "depressed", etc
	private String date; //the date the mood occurred
	private String happinessScale; //a number from 1 to 5 that describes how positive the mood is
	
	//constructor
	public Mood(String date, String title, String happiness) {
		this.date = date;
		this.moodTitle = title;
		this.happinessScale = happiness;
	}
	
	//setters
	public void setDate(String date) {this.date = date;}
	public void setMood(String mood) {this.moodTitle = mood;}
	public void setHappiness(String happiness) {this.happinessScale = happiness;}
	
	//getters
	public String getDate() {return date;}
	public String getMood() {return moodTitle;}
	public String getHappiness() {return happinessScale;}
	
	//toString
	public String toString() {
		String result = getDate() + "\n\t" + getMood() + " - " + getHappiness();
		return result;
	}
	
}
