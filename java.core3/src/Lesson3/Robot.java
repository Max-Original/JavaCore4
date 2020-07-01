package Lesson3;

public class Robot {
   
	public String name;
   
   Robot(String name){
	   this.name = name;
   }
   public static String work(){
	   return "I am a robot - I am working";
   }
  
@Override
public String toString() {
	return "Robot [name=" + name + "]";
}
  
}
