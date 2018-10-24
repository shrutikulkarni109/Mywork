 import java.util.*;
 public class SimpleInterest
 {
	public static void main(String args[])
	{
		int principle_amount,rate,time;
		int sI;
		System.out.println("Enter principle_amount,rate,time to calculate simple Interest ");
		Scanner sc= new Scanner(System.in);
		
		principle_amount=sc.nextInt();
		rate=sc.nextInt();
		time=sc.nextInt();
		
		sI=(principle_amount*rate*time)/100;
		System.out.println("Simple interest is  " + sI);
		
	}
 }