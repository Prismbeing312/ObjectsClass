package objectsClass;

import java.util.Scanner;

public class Excersize1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter city: ");
		String city = input.nextLine();
		System.out.println("Enter street: ");
		String street = input.nextLine();
		System.out.println("Enter street number: ");
		int streetNum = input.nextInt();
		input.nextLine();
		Address myAddress = new Address(city , street, streetNum);
		System.out.println("Enter name: ");
		String pname = input.nextLine();
		System.out.println("enter your age: ");
		int pAge = input.nextInt();
		Person person1 = new Person(pname, pAge, myAddress);
        System.out.println(person1.toString());
        System.out.println();
        System.out.println();
	    Animal animal = new Animal("Dog", 4, "Brown");
        System.out.println(animal.toString());
		
       	}

}
