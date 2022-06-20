	import java.util.*;
	public class fibonacci {
	public static void main(String[] args) {
		accept();
	}
	public static void accept() {
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
		
		
		
		
		