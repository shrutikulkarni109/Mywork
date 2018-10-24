import java.util.*;
/*class A 
{ 
    public A(int x){} 
} 
class B extends A { } 
public class test 
{ 
    public static void main (String args []) 
    {
        A a = new B(); 
        System.out.println("complete"); 
    } 
}*/


//public class test
//{
	/*  
    static int j; 
    static void methodA(int i)
    {
        boolean b; 
        do
        { 
            b = i<10 | methodB(4); // Line 9 
            b = i<10 || methodB(8);   Line 10 
        }while (!b); 
    } 
    static boolean methodB(int i)
    {
        j += i; 
        return true; 
    } 
    public static void main(String[] args)
    {
        methodA(0); 
        System.out.println( "j = " + j ); 
    }
	*/ 
	
	
	
	
	
	
	/*
	public static void main(String args[]){
	String a = "newspaper";
a = a.substring(5,7);
char b = a.charAt(1);
a = a + b;
System.out.println(a);
	
	}*/
	
	
	
	
	
	
	
	
	
	

 
    /*public static void stringReplace (String text) 
    {
        text = text.replace ('j' , 'c'); 
    } 
    public static void bufferReplace (StringBuffer text) 
    { 
        text = text.append ("c");  
    } 
    public static void main (String args[]) 
    { 
        String textString = new String ("java"); 
        StringBuffer textBuffer = new StringBuffer ("java"); 
        stringReplace(textString); 
        bufferReplace(textBuffer); 
        System.out.println (textString + textBuffer); 
    } 
*/
	
	
	
	
//}


class Tree { } 
class Pine extends Tree { } 
class Oak extends Tree { } 
public class test 
{ 
    public static void main (String [] args)
    { 
        Tree tree = new Pine(); 
        if( tree instanceof Pine ) 
            System.out.println ("Pine"); 
        else if( tree instanceof Tree ) 
            System.out.println ("Tree"); 
        else if( tree instanceof Oak ) 
            System.out.println ( "Oak" ); 
        else 
            System.out.println ("Oops "); 
    } 
}

