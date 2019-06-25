
package fundamentals;
import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {
		
		String gender;
		int age;
		Scanner s=new Scanner(System.in);
		gender=s.nextLine();
		age=s.nextInt();
		if((gender.equals("Male")) && (age>0&&age<59))
		{
			System.out.println("percentage of intrest=8.4%");
		}
		else if((gender.equals("Male")) && (age>58&&age<101))
		{
			System.out.println("percentage of intrest=10.5%");
		}
		else if((gender.equals("Female")) && (age>0&&age<59))
		{
			System.out.println("percentage of intrest=8.2%");
		}
		else if((gender.equals("Female")) && (age>58&&age<101))
		{
			System.out.println("percentage of intrest=9.2%");
		}
	}

}