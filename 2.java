import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n;
       
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        int a[] = new int[n];
       
        
        for(int i = 0; i < n ; i++)
        {
            a[i] = s.nextInt();
          
            
        }
         int max=a[0];
         int min=a[0];
        for(int i = 0; i < n ; i++)
        {
            if(a[i]<min){
            min=a[i];
           
            } 
             if(a[i]>max){
               max=a[i]; 
            }
        }
              System.out.println("Maximum:"+max);
            
        System.out.println("Minimum:"+min);
      
    }
}