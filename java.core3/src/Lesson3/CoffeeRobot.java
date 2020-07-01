package Lesson3;

public class CoffeeRobot extends Robot{
	
	public String coffee;
	
	CoffeeRobot(String name, String coffee) {
		super(name);
		this.coffee = coffee;
	}

	@Override
	public String toString() {
		return "CoffeeRobot [coffee=" + coffee + ", name=" + name + ", work()=" + work() + "]";
	}
	public String workCoffeeRobot() {
		return "I am a Coffee Robot - I do the best coffee you can bye";
	}

	
}
