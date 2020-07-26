
public class RemoveZero {

	public static void main(String[] args) 
	{
		
       int a[] = {0,1,0,1,1,0,8,0,9};
      
       int len =0;
       
       for(int i=0;i<a.length;i++)
       {
    	   
    	   if(a[i]!=0) {
			len++;
		}
       }
       
       int ar[] = new int[len];
       
       for(int i=0, j=0; i<a.length;i++)
       {
    	   
    	   if(a[i]!=0)
    	   {
    		   ar[j]= a[i];
    		   j++;
    	   }
    	   
       }
       
       
       System.out.println("The final array is ::");
       {
    	   for (int j=0;j<ar.length;j++)
    	   {
    		   System.out.println(ar[j]+"");
    	   }
       }
       
	}

}
