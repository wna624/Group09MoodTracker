package application;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;

public class MoodTracker {
	private ArrayList<Mood> moodList = new ArrayList<Mood>();
	private FileWriter out = null;
	private Scanner in = null;
	
	//constructor
	public MoodTracker() throws FileNotFoundException {
		loadMoods();
	}
	
	//adds Mood object to the ArrayList of moods and writes the new mood to the output file
	public void addMood(Mood newMood) throws IOException {
		moodList.add(newMood);
		out = new FileWriter("..\\Group09MoodTracker\\data\\moodlog.csv");
		out.write(newMood.getDate() + "," + newMood.getMood() + "," + newMood.getHappiness());
		out.close();
	}
	
	//prints toString of each Mood object in the ArrayList
	public String getMoods() {
		String result = "";
		for (int i = 0; i < moodList.size(); i++) {
			result += moodList.get(i).toString();
		}
		return result;
	}
	
	//reads in the moods from the output file and loads them into the ArrayList
	public void loadMoods() throws FileNotFoundException {
		File f = new File("..\\Group09MoodTracker\\data\\moodlog.csv");
		in = new Scanner(f);
		String line, inDate, inMood, inHappiness;
		String[] moodInfo;
		
		while(in.hasNextLine()) {
			line = in.nextLine();
			moodInfo = line.split(",");
			inDate = moodInfo[0];
			inMood = moodInfo[1];
			inHappiness = moodInfo[2];
			moodList.add(new Mood(inDate, inMood, inHappiness));
		}
		in.close();
	}
	
	
}