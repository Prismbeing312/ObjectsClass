package persons2;

public class MyMain {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person("Omer", 22, "Ramat gan granados");
		Person person3 = new Person("Dylan", 23);
		Person person4 = new Person(25);
        System.out.printf("\n %s \n %s \n %s \n %s",
        		person1, person2, person3, person4);
	}

}
