import java.util.*;
import java.io.*;
public class mat{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int arr1[][]=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr1[i][j]=sc.nextInt();
}
}
for(int i=0;i<n;i++)
{
for(int j=m-1;j>=0;j--)
{
System.out.println(arr1[j][i]);
}
}
}
}