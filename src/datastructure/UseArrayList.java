package datastructure;

import java.util.ArrayList;
import java.util.Random;

public class UseArrayList {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		Random rm = new Random();
		for(int i=0; i<15; i++) {
		  numList.add(rm.nextInt(500));
		}
		for(int savin: numList) {
		 System.out.println(savin);
		}
	}
}
