import java.util.*;

public class No_1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        for(int i = 1;i<=a;i++) {
        	for(int j=1;j<=a-i;j++) {
        		System.out.print("  ");
        	}
        	for(int n = i; n>=1;n--) {
        		System.out.print(n+" ");
        	}
        	for(int n = 2; n<=i;n++) {
        		System.out.print(n+" ");
        	}
        	System.out.println();
        }

	}
	
}
