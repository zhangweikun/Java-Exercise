import java.util.Scanner;

public class No_2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
        String a=in.nextLine();
        int i=0;
        char[] put_out;
        put_out=new char[a.length()];
        int begin=0;
        while(i<a.length()) {
        	put_out[i]=a.charAt(i);
        	if(a.charAt(i)==' ') {
        		for(int end=i-1;end>=begin;end--) {
        			System.out.print(put_out[end]);
        		}
        		System.out.print(" ");
        		begin=i+1;
        	}
        	i++;
        }
        for(int end=i-1;end>=begin;end--) {
			System.out.print(put_out[end]);
		}
	}

}
