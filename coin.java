import java.util.*;
import java.io.*;
public class coin{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total rupess");
		int total=sc.nextInt();
		int rem=0,amt=0,sum=0;
		System.out.println("Enter the number of coins");
		int n=sc.nextInt();
		int[] coins=new int[n];
		System.out.println("Enter the value of coins");
		for(int i=0;i<n;i++)
		{
			coins[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(coins[i]<coins[j])
				{
					int temp=coins[i];
					coins[i]=coins[j];
					coins[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
		 System.out.println(coins[i]);
		}
		for(int i=0;i<n;i++)
		{
			amt=total/coins[i];
			rem=total%coins[i];
			total=rem;
			sum=sum+amt;
			System.out.println(coins[i]+"---->"+amt);
		}
		System.out.println("Minimum number of coins needed"+sum);
		
	}
}