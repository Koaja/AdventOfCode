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

			int boxSideA = l * w;
			int boxSideB = w * h;
			int boxSideC = h * l;

			System.out.println("Box: " + line); // box dimensions

			// stores the smallest side / extra papper for each present
			int extraPapperPerBox = getSmallerSide(boxSideA, boxSideB, boxSideC);

			System.out.println("Smallest side: " + extraPapperPerBox);

			// box area for each present
			int boxArea = 2 * (boxSideA + boxSideB + boxSideC);

			System.out.println("Box Area: " + boxArea);

			// total extra papper
			extraPapper = extraPapper + extraPapperPerBox;
			System.out.println("Total extra papper: " + extraPapper);

			// total papper required
			papperNeeded = papperNeeded + boxArea;
			System.out.println("Total exact papper: " + papperNeeded);

			System.out.println("----");
		}
		System.out.println("Total papper:" + (papperNeeded + extraPapper));

	}

	public static int getSmallerSide(int sideA, int sideB, int sideC) {
		return Math.min(Math.min(sideA, sideB), sideC);
	}

}
