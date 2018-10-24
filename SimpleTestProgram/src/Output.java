import java.util.*;
public class Output
{
	public static void main(String args[])
	{
		/*
		// output is result 10
		
		
		 int result = 0;
        short s = 42;
        Long x = new Long("42");
        Long y = new Long(42);
        Short z = new Short("42");
        Short x2 = new Short(s);
        Integer y2 = new Integer("42");
        Integer z2 = new Integer(42);

        if (x == y) // Line 13 
            result = 1;
        if (x.equals(y) ) //Line 15 
            result = result + 10;
        if (x.equals(z) ) //Line 17 
            result = result + 100;
        if (x.equals(x2) )// Line 19 
            result = result + 1000;
        if (x.equals(z2) ) // Line 21 
            result = result + 10000;

        System.out.println("result = " + result);
		*/
		
		
		/*reult is 10010
		
		int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  // Line 10 
            result = 1;
        if (b1.equals(b2) ) // Line 12 
            result = result + 10;
        if (b2 == b4)  // Line 14 
            result = result + 100;
        if (b2.equals(b4) ) // Line 16 
            result = result + 1000;
        if (b2.equals(b3) ) // Line 18 
            result = result + 10000;

        System.out.println("result = " + result);
		
		*/
		/*for(int i=0,c=3;i<c;i++,System.out.println(i))
		{
	//		System.out.println(i);
		}*/
		
		
		
		//the output will be null
		/*
		Class c=Output.class;  
        System.out.println(c.getClassLoader());  
        //If we print the classloader name of String, it will print null because it is an  
        //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
        System.out.println(String.class.getClassLoader()); */
	

/*	
		String x = "xyz";
x.toUpperCase(); // Line 2 
String y = x.replace('Y', 'y');
y = y + "abc";
System.out.println(y);
		
	*/	
		
		
		int i = (int) Math.random();
		System.out.println(i);
		
	}
}