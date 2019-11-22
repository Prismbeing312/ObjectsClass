package objectsClass;

public class Animal {
   public String type;
   public int amountLegs;
   public String color;
public Animal(String type, int amountLegs, String color) {
	this.type = type;
	this.amountLegs = amountLegs;
	this.color = color;
}

@Override
public String toString() {
	return "Animal [type=" + type + ", amountLegs=" + amountLegs + ", color=" + color + "]";
}
   
   
}
