
public class Diagonals {

	public static void main(String[] args) 
	{
		int a[][] = { {1,2,3}, {4,7,9},{10,12,15}};
	    int n =3;
		
	    System.out.print("Principal Diagonal is:");
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print(" "+a[i][j]);
				}
			}
		}
		
		System.out.println("");
		System.out.print("The other Diagonal is:");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)==(n-1))
				{
					System.out.print(" "+a[i][j]);
				}
			}
				
		}
				      
		}

	}


