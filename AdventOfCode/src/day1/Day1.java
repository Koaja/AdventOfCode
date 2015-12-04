package day1;

import java.io.*;

public class Day1 {
	public static void main(String[] args) throws IOException, InterruptedException {

		BufferedReader bf2 = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("C:\\Users\\Koaja\\Desktop\\location.txt"))));

		String line = "";
		int floor = 0;
		while ((line = bf2.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '(') {
					floor++;
				} else if (line.charAt(i) == ')') {
					floor--;
				}
			}
		}
		System.out.println("Santa reached floor: " + floor);
	}
}
