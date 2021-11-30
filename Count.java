import java.util.*;
public class Count{
public static void main (String[]arg)
{
String Name;
int  Letter=0;
Scanner scan=new Scanner(System.in);
System.out.println("enter name");
Name=scan.nextLine();
for( int i=0;i<Name.length();i++)
{
Letter++;
}
System.out.println("Number"+Letter);
}
}

