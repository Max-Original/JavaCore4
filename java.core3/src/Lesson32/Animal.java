package Lesson32;

public class Animal {
private String name;
private double speed;
private int age;

public Animal() {
	this.name = "Lion";
	this.speed= 25.1;
	this.age=5;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", speed=" + speed + ", age=" + age + "]";
}


}
