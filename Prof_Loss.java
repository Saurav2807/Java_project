//Q. WAP TO TAKE SELLING PRICE AND COST PRICE FROM USER AND PRINT PROFIT LOSS.
import java.util.*;
public class Prof_Loss
{
	public static void main(String[] args) {
	    int sell,cost;// VARIABLE DECLARITION
	    Scanner sc=new Scanner(System.in);// IT IS USED FOR TAKING USER INPUT
	    System.out.println("Enter Your cost Price Money:-");
	    cost=sc.nextInt();// STORING FIRST VALUE
	    System.out.println("Enter Your Selling Price Money:-");
	    sell=sc.nextInt();//STORING SECOUND VALUE

	    if(cost-sell<0)
        {
	    	System.out.println("You are in Profit");
	    	System.out.println("Your profit Money is :" +(sell-cost));
        }
	    else if(cost-sell>0)
        {
	      System.out.println("You are in Loss");
		  System.out.println("Your loss Money is :" +(cost-sell));
		}
		else
		  System.out.println("NEUTRAL");
	}
	}
