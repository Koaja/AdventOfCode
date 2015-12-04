package day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day2 {

	public static void main(String[] args) throws IOException {
		int l = 0;
		int w = 0;
		int h = 0;

		int papperNeeded = 0;
		int extraPapper = 0;

		BufferedReader bf2 = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("C:\\Users\\Koaja\\Desktop\\dimensions.txt"))));

		String line = "";

		while ((line = bf2.readLine()) != null) {
			String[] dim = line.split("x");
			
			l = Integer.parseInt(dim[0]);
			w = Integer.parseInt(dim[1]);
			h = Integer.parseInt(dim[2]);

			int boxSideA = 2 * l * h;
			int boxSideB = 2 * l * w;
			int boxSideC = 2 * h * w;

			System.out.println("Box: " + line); //box dimensions
			
			int smallerSide = getSmallerSide(boxSideA, boxSideB, boxSideC); // stores the smallest side / extra papper for each present 
			System.out.println("Smallest side: " + smallerSide);

			int boxArea = boxSideA + boxSideB + boxSideC; // box area for each present
			System.out.println("Box Area: " + boxArea);

			extraPapper = extraPapper + smallerSide; // total extra papper 
			System.out.println("Total extra papper: " + extraPapper);

			papperNeeded = papperNeeded + boxArea; // total papper required
			System.out.println("Total exact papper: " + papperNeeded);

			System.out.println("----");
		}
		System.out.println("Total papper:" + (papperNeeded + extraPapper));

	}

	/**
	 * 
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * @return the smaller side
	 */
	public static int getSmallerSide(int sideA, int sideB, int sideC) {
		if (sideA <= sideB && sideA <= sideC) {
			return sideA;
		} else if (sideB <= sideA && sideB <= sideC) {
			return sideB;
		}
		return sideC;
	}
}
