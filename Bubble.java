import java.util.*;
class Bubble{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        int n,i,j, t=0;
        System.out.println("Enter size of an Array:");
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        //Bubble sort
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        //print
        for(i=0;i<=n-1;i++)
        {
            System.out.println("After Sorted: "+"\t"+arr[i]);
        }
    }
}