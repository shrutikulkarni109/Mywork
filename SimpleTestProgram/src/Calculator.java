import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		int ch;
		double num1,num2,result=0;
		 //float b=0f;
		
		System.out.println("----------***Calculator***----------");
		
		do
		{
		
		System.out.println(" Operation:");
		System.out.println();
		System.out.println("Addition  1 ");
		System.out.println("Multiply  2 ");
		System.out.println("Divide    3 ");
		System.out.println("Subtract  4");
		System.out.println("Exit      5");
		Scanner sc=new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter your choice:: ");
		ch=sc.nextInt();
		if(ch<1 || ch>=5)
		{
			System.exit(0);
		}
		System.out.println("Enter two numbers");
//Camelcase in every method 
	
	num1=sc.nextDouble();
		num2=sc.nextDouble();
		result=0;
		switch(ch)
		{
			case 1:
				result=num1+num2;
				break;
			case 2:
				result=num1*num2;
				break;
			case 3:
				//expression precision int(result )=double/int double is bigger so it will convert to double
				result=num1%num2;
				
				//System.out.println(b);
				break;
			case 4:
				result=num1-num2;
				break;
			
		}
		 //b=(float)result;
		System.out.println("result is " + result);
		System.out.println();
		System.out.println();
		}while(ch!=5);
	}
}