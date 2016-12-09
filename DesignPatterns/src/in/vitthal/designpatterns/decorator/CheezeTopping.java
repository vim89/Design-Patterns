package in.vitthal.designpatterns.decorator;

public class CheezeTopping extends ToppingDecorator {

	public CheezeTopping() {
		// TODO Auto-generated constructor stub
	}
	
	public CheezeTopping(Pizza pizza) {
		// TODO Auto-generated constructor stub
		super(pizza);
		System.out.println("Added Cheeze");
	}
	
	public String getDescription() {
		return temperoraryPizza.getDescription() + ", Cheeze";
	}
	
	public double getPrice() {
		return temperoraryPizza.getPrice() + 5;
	}

}