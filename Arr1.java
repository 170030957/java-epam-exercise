import java.io.*;
import java.util.*;

public class Arr1
{
 public static void main(String []args){
       int []a=new int[100];
       int i,sum=0;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       for(i=0;i<n;i++)
       {
           sum=sum+a[i];
       }
       System.out.println(sum);
       int avg=sum/n;
      System.out.println(avg); 
     }
}