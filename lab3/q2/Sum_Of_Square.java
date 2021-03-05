import java.util.Scanner;

public class Sum_Of_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		int n=arr.length,sum=0;
		System.out.println("Enter numbers");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.println("Square of "+arr[i]+"is:"+(int)(Math.pow(arr[i], 2)));
			sum=(int)(sum + Math.pow(arr[i],2));
		}
		System.out.println("Sum of squares is:"+sum);
		sc.close();
		

	}

}

