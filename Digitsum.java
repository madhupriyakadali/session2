public class Digitsum 
{
    public static void main(String args[])
    {
        int n,rem,  sum = 0;
       java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter the number:");
        n= s.nextInt();
        while(n!= 0)
        {
            rem = n% 10;
            sum =  rem+sum;
            n= n/ 10;
        }
        System.out.println("Sum of Digits:"+sum);
    }
}