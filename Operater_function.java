package Function;
import java.util.*;
public class Operater_function {
		public static void main(String[] args) {
//			 TODO Auto-generated method stub
	 accept();
		}
		public static void accept() {
		
		int num1,num2,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your 1st No:-");
		num1=sc.nextInt();
		System.out.println("Enter Your 2nd No:-");
		num2=sc.nextInt();
		Arthmatic_operator(num1,num2);
		}
		public static void Arthmatic_operator(int num1,int num2) {
			int choice,i;
			Scanner in =new Scanner(System.in);
			System.out.println("Enter your Choice \n1:Addition \n2:Multiplication \n3:Subtraction \n4:Devision \n5:Module");
			i=in.nextInt();
			int add;
			add=num1+num2;
			int sub;
			sub=num1-num2;
			int mul;
			mul=num1*num2;		
			int dev;
		    dev	=num1/num2;
			int mod;
		    mod	=num1%num2;
		  
		switch(i) {
		case 1:
			System.out.println("Addition of these NO:-"+add);
			if (add%2==0) {
				System.out.println("This is even NO:-"+add);
			}
			else {
				System.out.println("This is Odd NO:-"+add);
			}
			break;
		case 2:
			System.out.println("Multiplication of Two NO:-"+mul);
			if (mul%2==0) {
				System.out.println("This is even NO:-"+mul);
			}
			else {
				System.out.println("This is Odd NO:-"+mul);
			}
			break;
		case 3:
			System.out.println("Subtraction of Two NO:-"+sub);
			if (sub%2==0) {
			System.out.println("This is even NO:-"+sub);
			}
			else {
			System.out.println("This is Odd NO:-"+sub);
			}
			break;
		case 4:
			System.out.println("Devision of Two NO:-"+dev);
			if (dev%2==0) {
			System.out.println("This is even NO:-"+dev);
			}
			else {
			System.out.println("This is Odd NO:-"+dev);
			}
			break;
		case 5:
			System.out.println("Module of Two NO:-"+mod);
			if (mod%2==0) {
			System.out.println("This is even NO:-"+mod);
			}
			else {
			System.out.println("This is Odd NO:-"+mod);
			}
			break;
		}
	}
}