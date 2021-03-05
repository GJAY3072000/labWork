import java.util.Scanner;

public class All_Combination {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of num1");
		num1=sc.nextInt();
		if(num1>9) {
			System.out.println("Invalid");
			System.exit(num1);
		}
		System.out.println("Enter value of num2");
		num2=sc.nextInt();
		if(num2>9) {
			System.out.println("Invalid");
			System.exit(num2);
		}
		System.out.println("Enter value of num3");
		num3=sc.nextInt();
		if(num3>9) {
			System.out.println("Invalid");
			System.exit(num3);
		}
		int arr[]= {num1,num2,num3};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					if(i!=j && j!=k && k!=i) {
						System.out.println(arr[i]+""+arr[j]+""+arr[k]);
					}
				}
			}
			
		}
		sc.close();

  }
}
