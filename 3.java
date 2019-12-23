import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=0;
		int a[]=new int[100];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
	
	
		int key=s.nextInt();
		for(int i=0;i<n;i++)
		{
		 if(key==a[i])
		 {
		 c=i;
		 }
		}
		System.out.println(c);
	}
}