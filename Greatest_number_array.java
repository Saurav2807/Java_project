//WAP in which you have to accept 10 numbers from the user and find out the greatest number.

package Array;
import java.util.*;
public class Greatest_number_array {
public static void main(String[] args) {
Great();
}
public static void Great() {
	int i,size,max;
	System.out.println("Enter Size:-");
	Scanner sc=new Scanner(System.in);	
	size = sc.nextInt();
	
	System.out.println("Now Enter Given Size Number:-");
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
        	System.out.println("Maximum value:"+max);
    }
}
