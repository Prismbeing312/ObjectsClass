package objectsClass;


public class Address {
	
       public String city;
       public String street;
       public int number;

       public Address(String pcity, String pstreet, int pnumber) {
		city = pcity;
		street = pstreet;
		number = pnumber;
	}
       @Override
       public String toString() {
       	return String.format(" %s  %s  %d ", city, street, number );
       }
       
}
