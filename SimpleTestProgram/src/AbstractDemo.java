import java.util.*;
public class AbstractDemo extends phone
{
		void callme()
		{
				System.out.println("called from abstractDemo");
		}
}
abstract class phone
{
	abstract void callme();
	void callmetoo()
	{
System.out.println("called from phone");
		
		
	}
}