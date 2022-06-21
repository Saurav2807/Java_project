package Array;

import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj=new Constructor();
	}
			Constructor() {
			int i,size=5,max;
			Scanner sc=new Scanner(System.in);	
			System.out.println("Enter 5 Numbers:-");
			int[]greater=new int[size];
				for(i=0;i<size;i++) 
				{
		            greater[i] = sc.nextInt();
		        }
		        	max = greater[0];
		        for(i= 0; i < size; i++)
		        	{
		        		if(max < greater[i])
		            {
		                max = greater[i];
		            }
		        }
		        	System.out.println("Greater value:"+max);
		    }
}

