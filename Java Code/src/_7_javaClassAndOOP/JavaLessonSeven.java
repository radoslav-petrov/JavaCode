package _7_javaClassAndOOP;

public class JavaLessonSeven {

	public static void main(String[] args) {
		Monster Frank = new Monster();
		
		Frank.name = "Frank";
		System.out.println(Frank.name + " has an attack of " + Frank.getAttack());
	}
}
