package Loop;
import java.util.*;
class palindrome_number{  
 
		 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  int n=151;//It is the number variable to be checked for palindrome
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("The Given value "+n+" palindrome number");    
		  else    
		   System.out.println("The Given value "+n+" not palindrome number");    
		}  
		}  
