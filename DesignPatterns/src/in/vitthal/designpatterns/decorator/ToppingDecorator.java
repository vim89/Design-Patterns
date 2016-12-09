package in.vitthal.designpatterns.decorator;

public abstract class ToppingDecorator implements Pizza{

	protected Pizza temperoraryPizza;
	
	public ToppingDecorator() {
		// TODO Auto-generated constructor stub
	}
	
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
