package datastructure;

import java.util.ArrayList;

public class UseStringArrayList {

	public static void main(String[] args) {
		Savin savinInMonday = new Savin();
		Savin savinInTuesday = new Savin();
		savinInMonday.setSleepHours("8");
		savinInTuesday.setSleepHours("10");
		ArrayList<Savin> stList = new ArrayList<Savin>();
		stList.add(savinInMonday);
		stList.add(savinInTuesday);
		System.out.println(stList.get(0).getSleepHours());
		System.out.println(stList.get(1).getSleepHours());
	}
}
