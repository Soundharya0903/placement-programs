import java.util.*;
import java.io.*;
public class mul{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int res=1;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(int i=1;i<n;i++)
{
  res=res*arr[i];
}
System.out.println(res);
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
System.out.println(arr[i]*arr[j]);
}
}
}
}
