public class AditionHelper implements Add
{
int c;
	public int sum(int a,int b)
{
 	c=a+b;
return c;
}
}
interface Add
{
public int  sum(int a,int b);
}