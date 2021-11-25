class Occurrence {
public static void main(String[] args) {

java.util.Scanner sc=new java.util. Scanner(System.in);
int[] arr= new int[5];
int toFind;

System.out.println("Enter the elements of the array: ");
for(int i=0; i<arr.length; i++)
{
//reading array elements from the user
arr[i]=sc.nextInt();
}
System.out.println("Array elements are: ");
// accessing array elements using the for loop
for (int i=0; i<arr.length; i++)
{
System.out.println(arr[i]);
}
System.out.println("enter the value to search");
toFind=sc.nextInt();

boolean found = false;

for (int n : arr) {
if (n == toFind) {
found = true;
break;
}
}
if(found)
System.out.println(toFind + " is found.");
else
System.out.println(toFind + " is not found.");
}
}