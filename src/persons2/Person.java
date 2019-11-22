package persons2;

public class Person {
     public String name;
     public int age;
     public String adrress;
     
     public Person() {
    	 this("Jake", 23, "Granados");
     }
     
	public Person(String name, int age, String adrress) {
		this.name = name;
		this.age = age;
		this.adrress = adrress;
	}
	
	public Person(String name, int age) {
		this(name, age, "Tel aviv");
	}
	
	public Person(int age) {
		this("Me!!!", age, "Ramat gan");
	}
	
	@Override
	public String toString() {
		return String.format("Your name is %s \n Your age is %d \n Your adrress is %s \n", name, age, adrress);
	}

}


