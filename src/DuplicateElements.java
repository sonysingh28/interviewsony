
public class DuplicateElements {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,1,3,2,5,6,5};
		//int i, j;
		//int count =0;
		System.out.print("Duplicate elements are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(" "+a[i]);
				}
				
			}
		}

	}

}
