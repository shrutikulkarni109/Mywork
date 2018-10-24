import  java.util.*;
public class MathUtilityMain
{
	public static void main(String args[])
	{
		int fact=0,num;
		boolean even; 
		boolean prime;
		System.out.println("Enter a num");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
	MathUtility utility=new MathUtility();
	fact=utility.calFact(num);

	System.out.println("fact is   " + fact);
	even=utility.isEven(num);
	if(even==true)
	{
	System.out.println(  num +  " is even"  );
	}
	else
	{		
		System.out.println( num + " is odd " );
	}
	prime=utility.isPrime(num);
	if(prime==true)
	{
	System.out.println(  num +  " is prime"  );
	}
	else
	{		
		System.out.println( num + " is not prime " );
	}

	
	}
}