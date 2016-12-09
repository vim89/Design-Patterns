package in.vitthal.designpatterns.decorator;

public class PlainDough implements Pizza {

	PlainDough() {
		System.out.println("Added Plain Dough");
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Added Dough";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 4;
	}
}