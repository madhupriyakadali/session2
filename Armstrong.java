import java.util.Scanner;
public class Armstrong
{
   public static void main(String[] args)
   {
      int n1, n2, total = 0, temp;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a number: ");
      x = sc.nextInt();
      temp = n1;
      while(n1 > 0)
      {
         n2 = n1 % 10;
         n1 = n1 / 10;
         total = total + (y * y * y);
      }
      if(temp == total)
      {
         System.out.println(temp + " is an Armstrong Number.");
      }
      else
      {
         System.out.println(temp + " is not an Armstrong Number.");
      }
      sc.close();
   }
}