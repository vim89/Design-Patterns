package in.vitthal.designpatterns.structural.decorator;

public class ChillyFlakesTopping extends ToppingDecorator {
	
	public ChillyFlakesTopping() {
		
	}
	
	public ChillyFlakesTopping(Pizza tempPizza) {
		super(tempPizza);
		System.out.println("Sprinkling Chilly Flakes");
	}
	
	public String getDescription() {
		return temperoraryPizza.getDescription() + ", Chilly Flakes";
	}
	
	public double getPrice() {
		return temperoraryPizza.getPrice() + 3;
	}
}
