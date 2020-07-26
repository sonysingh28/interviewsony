
public class Distinct {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,1,3,7,8,2,8,9};
		
		int c=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				for(a[i]==a[j])
				{
					System.out.print(" "+a[j]);
				}
			}
		}

	}

}
