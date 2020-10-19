package hcl;

import java.util.Scanner;

public class AreaOfTriangle {

	public static float solution(int b, int h) {
		float area = (float) (0.5 * b * h);
		return area;
	}

	public static void main(String[] args) {
		try{
		AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
		System.out.println("Welcome to area of triangle");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of base:");
		int base = scanner.nextInt();
		System.out.println("Enter the value of height:");
		int height = scanner.nextInt();
		scanner.close();

		System.out.println(AreaOfTriangle.solution(base, height));
		}
		catch(Exception ex){
			
		}
	}

}
