public class MathUtility implements UtilityFunction 
{
	 public boolean isPrime(int num)
	{
		
		
		int p;
		if(num==1 || num==0)
		{
			System.out.println( num + " is not a orime no ");
		}
		else
		{
		p=num/2;		
		for(int i=2;i<p;i++)
		{
			if(p%i==0)
				return (true);
			
			else
				return (false);
		}
		}
			
		
		
		
		
		
		
		
		return (true);
	}

public	int calFact(int num)
	{
		int fact=1;
		
		if(num==0 || num==1)
			return 1;
		for(int i=1;i<=num;i++)
			fact=fact*i;
		return fact;
	}
	public boolean isEven(int num)
	{
		if(num%2==0)
		{
			return (true) ;
		}
			else
			
			return (false);
	}
}