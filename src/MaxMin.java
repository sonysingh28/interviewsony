
public class MaxMin {

	public static void main(String[] args) 
	{
		int a[] = {5,10,15,18,51};
		
		int max = a[0];
		
		int min = a[0];
		 
		for (int i=0;i<a.length;i++)
		{
			if(a[i]> max)
			{
				max=a[i];
			}

		}
		
		System.out.print("Max element is :"+max);

		
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}

		}
		
		System.out.println("");
		System.out.print("Min element is :"+min);

	}

}
