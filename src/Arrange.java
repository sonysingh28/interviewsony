
public class Arrange {

	public static void main(String[] args) 
	{
		int a[] = {2,3,7,9,18};
		int b[] = {7,19,20,12};
		
		int c[] = new int [a.length+b.length];
		
		int count =0;
		
		for (int i=0;i<a.length;i++)
		{
			c[i] = a[i];
			count++;
		}

		
		for (int j=0;j<b.length;j++)
		{
			c[count++]= b[j];
		}
		
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+",");
		}
	}

}
