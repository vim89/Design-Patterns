package in.vitthal.designpatterns.decorator;

//Blueprint for classes that will have decorators

public interface Pizza {
	
	public String getDescription();
	public double getPrice();
	
}


/* 
public abstract class Pizza{

	
	public abstract void setDescription(String newDescription);
	public abstract String getDescription();
	
	public abstract void setPrice(double newCost);
	public abstract double getPrice();
	
	// I could use getter and setter methods for every 
	// potential Pizza topping
	
}
*/