public class TwoD
{
	public static void main(String args[])
	{
		int array[][]={
						{1,2,3,4,4},
						{1,2,3,4,5},
						{1,2,3,4,}
						};
						int n=3;
						//int m=5;
		System.out.println("{");
		for(int i=0;i<n;i++)
		{
			
			System.out.print("{");
		
			//m= get length of current(Ith) row
			int m;
			int row[]=array[i];
			m=row.length;
			for(int j=0;j<m;j++)
			{
				
				System.out.print( array[i][j] +" ");
			
			}
			System.out.print("}");
			if(i!=n-1)
			{
				System.out.println(",");
			}
				
			
		}
			System.out.println();
		System.out.println("}");
	}
}