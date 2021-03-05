import java.util.Scanner;
public class Predicting_Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number:");
		int month=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("Input month is january");
			break;
		case 2:
			System.out.println("Input month is february");
			break;
		case 3:
			System.out.println("Input month is march");
			break;
		case 4:
			System.out.println("Input month is april");
			break;
		case 5:
			System.out.println("Input month is may");
			break;
		case 6:
			System.out.println("Input month is june");
			break;	
		case 7:
			System.out.println("Input month is july");
			break;	
		case 8:
			System.out.println("Input month is august");
			break;
		case 9:
			System.out.println("Input month is september");
			break;
		case 10:
			System.out.println("Input month is october");
			break;	
		case 11:
			System.out.println("Input month is november");
			break;	
		case 12:
			System.out.println("Input month is december");
			break;	
		default:
			System.out.println("Invalid");
			break;
		}
		sc.close();
	}

}
