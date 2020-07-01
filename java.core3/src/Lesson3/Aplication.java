package Lesson3;

public class Aplication {

	public static void main(String[] args) {
		
		Robot r = new Robot("Batia");
		System.out.println(r);
		System.out.println(r.work());
		
		CoffeeRobot cr = new CoffeeRobot("Cofemolka","late");
		System.out.println(cr);
		System.out.println(cr.workCoffeeRobot());
		
		RobotDancer dr = new RobotDancer("DanceroviRobot","Hip-hop");
		System.out.println(dr);
		System.out.println(dr.typeOfdance());
		
		RobotCoocer cor = new RobotCoocer("Cook", "Pasta");
		System.out.println(cor);
		System.out.println(cor.whatDish());
		
		String [] RobotMasuv= {"r","cr","dr","cor"};
		for (int i = 0; i<RobotMasuv.length;i++) {
			System.out.println(RobotMasuv[i]+" "+Robot.work()); 
		}
	}

}
