package datastructure;

import java.util.ArrayList;

public class UseArrayListWithString {

	public static void main(String[] args) {
		ArrayList<String> stList = new ArrayList<String>();
		stList.add("NY");
		stList.add("CA");
		for(int i=0; i<stList.size(); i++) {
			System.out.println(stList.get(i));
		}
		for(String st:stList) {
			System.out.println(st);
		}

	}

}
