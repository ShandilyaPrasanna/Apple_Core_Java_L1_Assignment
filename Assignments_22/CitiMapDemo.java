package corejavaL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CitiMapDemo {
	public static void main(String[] args) throws IOException {
		String city = null;
		System.out.println("Please Enter only one City name!");

		if (args.length != 1) {
			BufferedReader bf = new BufferedReader(new InputStreamReader(
					System.in));
			city = bf.readLine();
			// return;
			System.out.println("City namne is::"+city);
		}
		HashMap<String, String> cityTable = new HashMap<>();
		cityTable.put("Delhi", "India");
		cityTable.put("Kathmandu", "Nepal");
		cityTable.put("NewYork", "USA");
		cityTable.put("Tokyo", "Japan");
		cityTable.put("London", "UK");
		cityTable.put("Havana", "Cuba");
		cityTable.put("Beijing", "China");
		cityTable.put("Pune", "India");
		cityTable.put("Mumbai", "India");
		cityTable.put("Bhubaneswar", "India");
		char ch = city.charAt(0);
		city = city.substring(1);
		city = Character.toUpperCase(ch) + city;
		if (cityTable.containsKey(city)) {
			System.out.println("Name of country corresponding to city is::"+cityTable.get(city));
		} else {
			System.out.println("City not in List");
		}
	}

}
