package mathOperators;

public class Operators1 {
    int num1;
    int num2;
    
    public int subtract(int num1, int num2) {
    	return this.num1 - this.num2;
    }
    
    
    public int times(int num1, int num2) {
    	return this.num1 * this.num2;
    }
    
    
    public int add(int num1, int num2) {
    	return this.num1 + this.num2;
    }
    
    public int devide(int num1, int num2) {
    	return (int) (this.num1 / this.num2);
    }


	public Operators1(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
    
    
}
