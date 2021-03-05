import java.util.Scanner;

public class Sum_Of_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=40;i<250;i++) {
			if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of integers b/w 40 to 250 which is divisible by 5 is:"+sum);
		sc.close();

	}

}
