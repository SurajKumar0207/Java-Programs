package javaPrograms;

import java.util.*;
public class NonFibonacci
{
    // Non Fibonacci elements in an Array
    public static void nonFib(int[] arr,int max) {
        int len=arr.length;
    
        int a=0,b=1;
        int c;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<=max;i++) {
            c=a+b;
            list.add(a);
            a=b;
            b=c;
        }
        List<Integer> li=new ArrayList<>();
            int count=0;
        for(int i=0;i<len;i++)
        {
            int j;
            for(j=0;j<list.size();j++)
            {
                if(arr[i]==list.get(j))
                    break;
            }
            if(j==list.size()) {
                li.add(arr[i]);
                count++;
            }
        }
    
            for(Integer k:li)
                System.out.print(k+" ");
        
    }
public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int max=5;
    for(int i=0;i<arr.length;i++) {
        arr[i]=sc.nextInt();
        if(max<arr[i])
        max=arr[i];
    }
    
    nonFib(arr,max);

}
}
