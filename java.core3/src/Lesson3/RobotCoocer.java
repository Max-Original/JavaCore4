package Lesson3;

public class RobotCoocer extends Robot{
	
	private String dish;
	
	RobotCoocer(String name,String dish) {
		super(name);
		this.dish = dish;
	}
	public String whatDish() {
		return "I am a cook, best dishes you can teaste ";
	}
	@Override
	public String toString() {
		return "RobotCoocer [dish=" + dish + ", name=" + name + ", work()=" + work() + "]";
	}
	
	
}
