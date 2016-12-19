package in.vitthal.designpatterns.behavioral.strategy;

public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal tommy = new Dog();
		Animal tweety = new Bird();
		Animal pengu = new Penguin();
		
		System.out.println("Dog: " + tommy.tryToFly());
		
		System.out.println("Bird: " + tweety.tryToFly());
		
		System.out.println("Penguin: "+pengu.tryToFly());
		
		// This allows dynamic changes for flyingType
		
		// Avail flying ability to Dog tommy
		tommy.setFlyingAbility(new ItFlys());
		
		System.out.println("Dog: " + tommy.tryToFly());
		
	}
	
}