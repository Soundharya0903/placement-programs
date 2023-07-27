import java.util.*;
import java.io.*;
public class reverse{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the sentence");
		String[] s=sc.nextLine().split(" ");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.println(s[i]+" ");
		}
	}
	}