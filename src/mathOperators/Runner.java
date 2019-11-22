package mathOperators;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first num ");
		int a = input.nextInt();
		System.out.println("Enter second num ");
        int b = input.nextInt();
        Operators1 var = new Operators1(a, b);
        System.out.println(var.add(a, b));
        System.out.println(var.devide(a, b));
        System.out.println(var.subtract(a, b));
        System.out.println(var.times(a, b));
	}

}
