 import java.util.*;

 public class StringArray
 {
	public static void main(String args[])
	{
		String str2 ="shruti";
		//System.out.println(str2.length());
		
		//int n;
	//	n=str2.lenght();
		
	//	System.out.println(n);
		
		int num;
		String a;
		 String str1="";
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no ");
	
		num=sc.nextInt();
		a=sc.nextLine();
		String str[]= new String[num];
		
		for(int i=0; i<num;i++)
		{
			str[i]=sc.nextLine();
			
		}
		for(int i=0; i<num;i++)
		{
			
			System.out.println( "str[" + i + "]= " + str[i] + " lenght is " + str[i].length());
			
			//System.out.println("str2 is equals with " + str[i] +  " " + str[i].equals(str2));
			//System.out.println(str[i].equals(str[i++]));
			str1=str1+str[i] + " ";
		
			
		}
		System.out.println(  str1 );
		//System.out.println(str1.lenght);
		
		
		
		
		/*
		for(int i=0; i<num;i++)
		{
		System.out.print(  str[i]  + " " + str[i] + " " + str[i] );
			
		}*/
		
	}
 }