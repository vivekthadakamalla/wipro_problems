package fundamentals;
import java.util.*;

public class problem10 {
	public static void main(String[]args)
	{
		
			char ch;
			int temp;
			Scanner sc=new Scanner(System.in);
			ch=sc.next().charAt(0);
			if(ch>=97&&ch<123)
			{
			temp = (int) ch;
	        temp = temp - 32;
	        ch = (char) temp;
	        
	         System.out.println(ch);
		}
			else
			{
				temp = (int) ch;
		        temp = temp + 32;
		        ch = (char) temp;
		        System.out.println(ch);
			}

	}
	}