package day1;

import java.io.*;

public class Day1 {
	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader bf2 = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("C:\\Users\\Koaja\\Desktop\\location.txt"))));
		int charLocation = 0;
		String line = "";
		int floor = 0;
		while ((line = bf2.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '(') {
					floor++;
					charLocation++;
					System.out.println("Santa went up to level: " + floor);
					Thread.sleep(500);
				} else if (line.charAt(i) == ')') {
					floor--;
					charLocation++;
					System.out.println("Santa went down to level: " + floor);
					Thread.sleep(500);
					if (floor == -1) {
						System.out.println(
								"Location in string of char that causes Santa to reach basement: " + charLocation);
					}
				}
			}
		}
		System.out.println("Santa finally stopped at floor: " + floor);
	}
}
