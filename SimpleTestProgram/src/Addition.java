import java.util.*;
public class Addition
{

	public static void main(String args[])
{
 		int a,b,c,java;
	  	Scanner sc=new Scanner(System.in);

		a=sc.nextInt();
		b=sc.nextInt();

		AditionHelper additionHelper=new AditionHelper();
		c=additionHelper.sum(a,b);

		System.out.println(c);
		System.out.println("Added");
}
}
