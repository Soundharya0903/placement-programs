import java.util.*;
import java.io.*;
public class reversespacing{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the sentence");
		String s=sc.nextLine();
		char[] r=new char[s.length()];
		for(int i=s.length()-1;i>=0;i--)
		{
			r[i]=s.charAt(i);
			
		}
		String rev=new String(r);
		rev = rev.replaceAll("\\s+", "");
		StringBuilder sb=new StringBuilder(rev);
        StringBuilder rev2=sb.reverse();
		System.out.print(rev2);
		char[] a=new char[rev2.length()];
		for(int i=0;i<rev2.length();i++)
		{
			a[i]=rev2.charAt(i);
		}
		for(int i=0;i<rev2.length();i++)
		{
			System.out.println(a[i]);
		}
		int j=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ')
			{
				System.out.print(" ");
				
			}
			else{
				System.out.print(a[j]);
				j++;
			}
		}
		
			
	}
	}