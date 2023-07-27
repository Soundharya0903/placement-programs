import java.util.*;
import java.io.*;
public class unique{
public static void main(String args[]){
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
for(int i=0;i<n;i++){
for(int j=i+1;j<n-1;j++)
if(arr[i]==arr[j]){
continue;
}
else
{
System.out.println(arr[i]);
}
}
}
}  