

import java.util.Scanner;


public class Array {

    
    public static void main(String[] args) {
      
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n=sc.nextInt();
       int arr[]=new int[n];
       int temp;
       for(int i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
        }
       for(int i=0;i<n;i++)
       {
           for(int j=i;j<n;j++)
           {
               if(arr[i]>arr[j]){
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;}
           }
       }
       int max=arr[n-1];
       int k=arr[0];
       int diff=0;
       for(int i=0;i<n;i++){
        if(k!=arr[i])
           { System.out.println(k);
k++;}

           
         k++;
      }}
}
    
    

