import java.util.Scanner;

public class No_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in =new Scanner(System.in);
        float a=in.nextFloat();
        while(a!=0.00) {
        	float total=a*100;
            int num=0;
            for(int i=0;i<=total/10000;i++) {
            	for(int j=0;j<=(total-10000*i)/5000;j++) {
            		for(int k=0;k<=(total-10000*i-5000*j)/2000;k++) {
            			for(int q=0;q<=(total-10000*i-5000*j-2000*k)/1000;q++) {
            				for(int w=0;w<=(total-10000*i-5000*j-2000*k-1000*q)/500;w++) {
            					for(int e=0;e<=(total-10000*i-5000*j-2000*k-1000*q-500*w)/200;e++) {
            						for(int r=0;r<=(total-10000*i-5000*j-2000*k-1000*q-500*w-200*e)/100;r++) {
            							for(int t=0;t<=(total-10000*i-5000*j-2000*k-1000*q-500*w-200*e-r*100)/50;t++) {
            								for(int y=0;y<=(total-10000*i-5000*j-2000*k-1000*q-500*w-200*e-r*100-t*50)/20;y++) {
            									for(int u=0;u<=(total-10000*i-5000*j-2000*k-1000*q-500*w-200*e-r*100-t*50-20*y)/10;u++) {
            										for(int p=0;p<=(total-10000*i-5000*j-2000*k-1000*q-500*w-200*e-r*100-t*50-20*y-10*u)/5;p++) {
            											if(total==i*10000+j*5000+k*2000+q*1000+w*500+e*200+r*100+t*50+y*20+u*10+p*5) {
            												num++;
            											}
            										}
            									}
            								}
            							}
            						}
            					}
            				}
            			}
            		}
            	}
            }
            System.out.println(a+" "+num);
            a=in.nextFloat();
        }
	}
	
}
