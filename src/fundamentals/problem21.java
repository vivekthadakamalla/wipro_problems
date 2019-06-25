package fundamentals;

import java.util.Scanner;

public class problem21 {

	public static void main(String[] args) {
		int m=0,r,sum=0,temp=0;
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        temp=m;
        while(m>0)
        {
        	r=m%10;
        	sum=sum*10+r;
        	m=m/10;
        }
        if(temp==sum)
        {
        	System.out.println(sum+" is a palindrome");
        }
        else
        {
        	System.out.println(temp+" is not a palindrome");
        }
		

	}

}
