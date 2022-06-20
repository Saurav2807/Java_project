package Loop;

public class Own_name {
	public static void main(String[] args) {              	                                                 
	                 
	                                                      
	//for own name                                               
														 													
	for(int i=1;i<=7;i++) {
		for(int j=1;j<=57;j++) {
			if(i==1)
			{
				if (j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==14||j==21||j==27||j==31||j==32||j==33||
					j==34||j==44||j==51||j==57) 
				{
					System.out.print("*");				
				}
				else 
				{
					System.out.print(" ");
			    }
			}
			else if (i==2) {
				if (j==1||j==16||j==12||j==21||j==27||j==31||j==35||j==42||j==46||j==51||j==57) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
			else if (i==3) {
				if (j==1||j==11||j==17 ||j==21||j==27||j==31||j==36||j==41||j==47||j==51||j==57) {
					System.out.print("*");
				}	
				else {
					System.out.print(" ");
				}
			}
			else if (i==4) {
				if (j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==11||j==12||j==13||j==14||j==15||
					j==16||j==17||j==21||j==27||j==31||j==32||j==33||j==34||j==41||j==47||j==42||
					j==43||j==47||j==44||j==45||j==46||j==51||j==57) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
			else if (i==5) {
				if (j==7||j==11||j==17||j==21||j==27||j==31||j==35||j==41||j==47||j==52||j==56) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
			else if (i==6) {
				if (j==7 || j==11 || j==17 || j==21|| j==27||j==31||j==36||j==41||j==47||j==53||j==55) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
			else if (i==7) {
				if (j==1||j==2||j==3||j==4||j==5||j==6||j==7||j==11||j==22||j==23||j==24||j==25||
					j==26||j==17||j==21||j==27||j==31||j==37||j==41||j==47||j==54) {
					System.out.print("*");
				
				}
				else {
					System.out.print(" ");
				}
			}
		}
		System.out.println();
	}
	}
}