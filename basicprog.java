package testpro1;
import java.util.Scanner;
public class basicprog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total marks ");
		int total = sc.nextInt();
		System.out.println("Enter marks obtained ");
		int marks_obtained = sc.nextInt();
		float percent = (total/marks_obtained)*100f;
		if(percent >= 70)
			System.out.println("Your Grade - A ");
		else if(percent >= 50)
			System.out.println("Your Grade - B ");
		else if(percent >= 40)
			System.out.println("Your Grade - C ");
		else
			System.out.println("Your Grade Fail ");
			

	}

}
