import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp;
		char s;
		int a[]=new int[100];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
        for(int i=0;i<n;i++)
		{
		   
		    for(int j=0;j<n;j++){
		    if(a[i]<a[j]){
		        temp=a[i];
		        a[i]=a[j];
		        a[j]=temp;
		    }
		}
		}
		System.out.println("sorted array is");
        for(int i=0;i<n;i++)
         System.out.print(a[i]+" "); 
        
	}
	
	
}