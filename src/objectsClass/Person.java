package objectsClass;

public class Person {
	public String name;
	public int age;
    public Address address;
    
    Person(String name, int age, Address address) {
    	this.name = name;
    	this.age = age;
    	this.address = address;
    }
    
    @Override
    public String toString() {
    	return String.format("name: %s , age: %d  \n address: %s ", name, age, address );
    }
}
