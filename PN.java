import java.util.Scanner;
public class PN
{
public static void main(String args[])
{
int n;
Scanner input=new Scanner(System.in);
System.out.println("Enter the Integer number ");
n=input.nextInt();
if(n>0)
{
System.out.println("Positive number");
}
else if(n<0)
{
System.out.println("negative number");
}
else
{
System.out.println("Zero");
}
}
}