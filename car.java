import java.io.*;
public class Car {
private String name;
public String getName()
{
return name;
}
public void setName(String s)
{
this.name=s;
}
}
class CarMain{
public static void main(String[] args)
{
Car obj1=new Car();
Car obj2=new Car();
Car obj3=new Car();
Car obj4=new Car();
Car obj5=new Car();
obj1.setName("ford");
System.out.println(obj1.getName());
obj2.setName("ford");
System.out.println(obj2.getName());
obj3.setName("volks");
System.out.println(obj3.getName());
obj4.setName("Benze");
System.out.println(obj4.getName());
obj.setName("ferrari");
System.out.println(obj.getName());
obj5.setName("BMW");
System.out.println(obj5.getName());
}
}