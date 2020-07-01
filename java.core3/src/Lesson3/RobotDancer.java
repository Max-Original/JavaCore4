package Lesson3;

public class RobotDancer extends Robot {

	private String typeOfDance;

	RobotDancer(String name, String typeOfDance) {
		super(name);
		this.typeOfDance = typeOfDance;
		}
	public String typeOfdance() {
		return "I am a Dancing Robot, I can dance like Rihanna";
	}
	@Override
	public String toString() {
		return "RobotDancer [typeOfDance=" + typeOfDance + ", name=" + name + ", work()=" + work() + "]";
	}
	
}
