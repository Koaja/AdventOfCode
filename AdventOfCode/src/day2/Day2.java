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

		int finalArea = 0;
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

			int smallerSide = getSmallerSide(boxSideA, boxSideB, boxSideC);

			int boxArea = boxSideA + boxSideB + boxSideC;
			extraPapper = boxArea + smallerSide;
			finalArea = extraPapper + finalArea;
		}
		System.out.println(finalArea);

	}

	public static int getSmallerSide(int sideA, int sideB, int sideC) {
		if (sideA < sideB && sideA < sideC) {
			System.out.println(sideA);
			return sideA;
		} else if (sideB < sideA && sideB < sideC) {
			System.out.println(sideB);
			return sideB;
		}
		System.out.println(sideC);
		return sideC;
	}
}
