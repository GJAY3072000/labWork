import java.util.Scanner;

class Calculator{
  public static void main(String args[]){
     Scanner MyScanner = new Scanner(System.in);
     double No1,No2,Answer;

     System.out.print("Enter the No1:");
     No1 = MyScanner.nextDouble();

     System.out.print("Enter the No2:");
     No2 = MyScanner.nextDouble();

     Answer = No1 + No2;
     System.out.println("Addition is :"+Answer);

     Answer = No1 - No2;
     System.out.println("Subtraction is :"+Answer);

     Answer = No1/No2;
     System.out.println("Division is :"+Answer);

     Answer = No1*No2;
     System.out.println("Multiplication is :"+Answer);

  }
}
