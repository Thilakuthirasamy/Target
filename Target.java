import java.util.*;
public class Target
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int t=s.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++)
        arr[k]=s.nextInt();
        for(int i=0;i<n;i++)
        {
           for(int j=i;j<n;j++)
           {
               if((arr[i]+arr[j])==t && i!=j)
               {
                   System.out.println(arr[i]+","+arr[j]);
                   System.exit(0);
               }
           }
        }
    }
}

