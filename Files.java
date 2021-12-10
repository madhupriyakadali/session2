package car;
	import java.io.*;
	import java.util.*;



	public class Files {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the Directory path");
	String path=sc.nextLine();

	File fileRef=new File(path);



	if (fileRef.exists())
	{
	System.out.println(" "+fileRef );



	FileFilter filter = new FileFilter() {

	public boolean accept(File fileRef)
	{
	return fileRef.getName().endsWith("java");
	}
	};


	File[] files = fileRef.listFiles(filter);

	System.out.println("Files are:");


	for (int i = 0; i <files.length; i++) {
	System.out.println(files[i].getName());
	}

	}
	else{
	System.out.println("please check the path you give");
	}
	}
	}
