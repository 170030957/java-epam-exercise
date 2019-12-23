import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	
		char s;
		int a[]=new int[100];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
	
		for(int i=0;i<n;i++)
		{
		  s=(char)a[i];
		  System.out.println(s);
		}
	}
}