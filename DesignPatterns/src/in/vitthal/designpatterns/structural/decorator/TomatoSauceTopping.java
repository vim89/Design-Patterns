package in.vitthal.designpatterns.structural.decorator;

public class TomatoSauceTopping extends ToppingDecorator {

	public TomatoSauceTopping() {
		// TODO Auto-generated constructor stub
	}
	
	public TomatoSauceTopping(Pizza pizza) {
		// TODO Auto-generated constructor stub
		super(pizza);
		System.out.println("Added Tomato Sauce");
	}
	
	public String getDescription() {
		return temperoraryPizza.getDescription() + ", Tomato Sauce";
	}
	
	public double getPrice() {
		return temperoraryPizza.getPrice() + 3;
	}

}