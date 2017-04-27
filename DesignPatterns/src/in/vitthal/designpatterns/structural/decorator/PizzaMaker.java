package in.vitthal.designpatterns.structural.decorator;

public class PizzaMaker {

	public PizzaMaker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Preparing pizza..");

		Pizza myPizza = new ChillyFlakesTopping(new TomatoSauceTopping(new CheezeTopping(new OnionTopping(new PlainDough()))));

		System.out.println("Ingrediants: " + myPizza.getDescription());
		System.out.println("Price: " + myPizza.getPrice());
	}

}
