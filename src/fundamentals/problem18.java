package fundamentals;

import java.util.Scanner;
public class problem18 {

	public static void main(String[] args) {
		int m,r,sum=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m>0)
        {
        	r=m%10;
        	sum=sum+r;
        	m=m/10;
        }
        System.out.println(sum);
		
		// TODO Auto-generated method stub

	}

}
