import java.util.*;
public class Main
{
public static void main(String[] args)
{
Books obj1 = new BookStore("Ruskin Bond",800,"Fiction");
Books obj2 = new BookStore("One day life will change",600,"Fiction");
Books obj3= new BookStore("Batman",400,"comic");
Books obj4 = new BookStore("spider man",550,"comic");
Books obj5= new BookStore("American Gods",900,"Fantasy");
Books obj6= new BookStore("The way of kings",770,"fantasy");

List<Books> booksList = Arrays.asList(obj1,obj2,obj3,obj4,obj5,obj6);
ArrayList<BookShop> bookType =new ArrayList();



for(Books books : booksList)
{
System.out.println(books.getBookName());
if(books.getBookCategory().equals("Fiction"))
{



System.out.println(books.getBookName());



}
//int discount= bookType.getBookPrice()*0.9;
}



if(obj1.getBookPrice()>obj2.getBookPrice())
{
System.out.println(obj1.getBookName());
}
else
{
System.out.println(obj2.getBookName());
}
if(obj3.getBookPrice()>obj4.getBookPrice())
{
System.out.println(obj3.getBookName());
}
else
{
System.out.println(obj4.getBookName());
}
if(obj5.getBookPrice()>obj6.getBookPrice())
{s
System.out.println(obj5.getBookName());
}
else
{
System.out.println(obj6.getBookName());
}
int maxList = Collections.max(booksList);
{
System.out.println("Maximum value of list is: " +maxList);
}
}
}



[Yesterday 23:44] Durga Syamala Peruri

int maxList = Collections.max(booksList);
{
System.out.println("Maximum value of list is: " +maxList);
}