package Lesson32;

public class Aplication {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println("age= "+a.getAge()+" Name= "+a.getName()+" speed= "+a.getSpeed());
		a.setAge(6);
		a.setName("OlderLion");
		a.setSpeed(24.1);
		System.out.println("age= "+a.getAge()+" Name= "+a.getName()+" speed= "+a.getSpeed());
	}
	
}
