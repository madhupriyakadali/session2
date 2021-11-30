public class Manager
{
 public static void main(String[] args)
 {
  
   
   Department dept = new Department(1,"HR","sasi");
   Employee emp = new Employee(348,"priya",25000.50f,dept);
   System.out.println(emp);
}
}