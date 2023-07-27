import java.util.*;
import java.io.*;
public class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int target=sc.nextInt();
int b[]=new int[2];
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int temp;
/*for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}*/
for(int i=0;i<n;i++)
{
if(arr[i]+arr[i+1]==target)
{
b[0]=i;
b[1]=i+1;
for(int j=0;j<2;j++){
System.out.println(b[i]);
}
}
else
{
System.out.println("Target not achieved");
break;
}
}
}
}
