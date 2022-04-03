package loopAndMapDotEntry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoopandMapDotEntry {
	public static void main(String[] args) {
		/*Write a program that does the following:
		 *Asks the user for 5 numbers
		 *Stores them in an array list
		 *Finds the sum, product, largest, and smallest of those numbers*/
		List<Integer> anArrayList = new ArrayList<>(5);
		int anArrayListSum = 0;
		int anArrayListProduct=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers separated with enters?");
		for(int i = 0; i<5; i++) {
			anArrayList.add(i, Integer.parseInt(scan.nextLine()));
			anArrayListSum += anArrayList.get(i);
			anArrayListProduct *= anArrayList.get(i);
		}
		System.out.println(anArrayListSum);
		System.out.println(anArrayListProduct);
		System.out.println(Collections.max(anArrayList));
		System.out.println(Collections.min(anArrayList));
		
		/* You are a car dealer. Create a hash map of vehicles.
		 *The model is the Key, the make is the Value.
		 *Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
		 *(e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
		 */
		Map<String, String> vehicles = new HashMap<>();
		String[] model = {"Altima","Civic"};
		String[] make = {"Nissan", "Honda"};
		vehicles.put(model[0],make[0]);
		vehicles.put(model[1], make[1]);
		System.out.println("What car model are you looking for?");
		String CarModel = scan.nextLine(); 
		System.out.println("Oh, you're looking for a " +  CarModel + "? " + "Our " + vehicles.get(CarModel) + " selection is right over here...");
		
	}
}
