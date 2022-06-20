package Loop;
import java.util.*;
public class pyramid_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub							*
//																   ***
//																  *****
//																 *******

	int i,j,p;
    for(i=1;i<6;i++){
        for(j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(j=1;j<2*i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}

