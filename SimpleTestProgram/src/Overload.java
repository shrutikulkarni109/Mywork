
import  java.util.*;

class OverloadDemo
 {
	void test(byte c) 
	{

	System.out.println("No parameters");
	}
	int test(short a)
	{
		System.out.println(" short  No parameters");
		return (0);
	}
	int test(float a)
	{
		System.out.println(" float No parameters");
		return (0);
	}
	int test(Float a)
	{
		System.out.println(" Float No parameters");
		return (0);
	}
// Overload test for two integer parameters.
	void test(int a, int b)
	{ 
		System.out.println("a and b: " + a + " " + b);
		}
// overload test for a double parameter 
void test(double a)
 { 
 System.out.println("Inside test(double) a: " + a); 
 }
 }
class Overload 
{ public static void main(String args[])
 { OverloadDemo ob = new OverloadDemo(); int i = 88;
ob.test(new Integer(3));
 
ob.test(10, 20);

ob.test(i);
 // this will invoke test(double)
 ob.test(123.2);
 // this will invoke test(double)
}
}