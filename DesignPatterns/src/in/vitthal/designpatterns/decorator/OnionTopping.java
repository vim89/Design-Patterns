package in.vitthal.designpatterns.decorator;

public class OnionTopping extends ToppingDecorator {

	public OnionTopping() {
		// TODO Auto-generated constructor stub
	}
	
	public OnionTopping(Pizza pizza) {
		// TODO Auto-generated constructor stub
		super(pizza);
		System.out.println("Added Onion");
	}
	
	public String getDescription() {
		return temperoraryPizza.getDescription() + ", Onion";
	}
	
	public double getPrice() {
		return temperoraryPizza.getPrice() + 8;
	}

}