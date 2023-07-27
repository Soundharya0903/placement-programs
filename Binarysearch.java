import java.util.*;
import java.io.*;
public class Binarysearch{
public static int binary(int arr[],int first,int last,int key){
if(last>=first){
int mid=first+last/2;
if(arr[mid]==key)
{
return mid;
}
else if(arr[mid]>key)
{
return binary(arr,first,mid-1,key);
}
else
{
return binary(arr,mid+1,last,key);
}}
return -1;
}
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}
Arrays.sort(arr);
System.out.println("ENter the key");
int key=sc.nextInt();
int first=0;
int last=n-1;
int res=binary(arr,first,last,key);
if(res==-1)
{
System.out.println("Element not found");}
else
{
System.out.println(res);
}

}
}