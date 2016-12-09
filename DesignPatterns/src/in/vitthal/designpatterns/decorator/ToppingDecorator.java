package in.vitthal.designpatterns.decorator;

//Has a "Has a" relationship with Pizza. This is an
//Aggregation Relationship

public abstract class ToppingDecorator implements Pizza{

	protected Pizza temperoraryPizza;
	
	public ToppingDecorator() {
		// TODO Auto-generated constructor stub
	}

	// Assigns the type instance to this attribute
	// of a Pizza
	
	// All decorators can dynamically customize the Pizza
	// instance PlainPizza because of this
		
	
	public ToppingDecorator(Pizza pizza) {
		temperoraryPizza = pizza;
	}
	
	public String getDescription() {
		return temperoraryPizza.getDescription();
	}
	
	public double getPrice() {
		return temperoraryPizza.getPrice();
	}

}
