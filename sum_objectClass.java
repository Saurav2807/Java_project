package Array;

import java.util.Scanner;

public class sum_objectClass {

	public void sum() {
		int a,b,sum=0;
		System.out.println("Enter your no.");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		while (a>0) {
		b=a%10;
		sum=sum+b;
		a=a/10;
		}
		System.out.println("Sum of digit "+sum);
	}
	public void fibonacci() {
		Scanner sc=new Scanner(System.in);
		int num1,num2=0,num3=1,sum;
		System.out.println("Enter The No.:-");
		num1=sc.nextInt();
		System.out.println(num2+"\n"+num3);

		for(int i=1;i<num1-1;i++) {
		 sum=num2+num3;
		 System.out.println(sum);
		 num2=num3;
		 num3=sum;
		}
	}
}
