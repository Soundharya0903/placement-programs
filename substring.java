import java.util.*;
import java.util.LinkedList;
public class substring{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> l=new LinkedList<>();
		System.out.println("Enter a string");
		String str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length()-1;j++)
			{
			 String pal=str.substring(i,j);
			 String rev="";
		    
			  
		for(int m=pal.length()-1;m>=0;m--)
		{
			rev+=pal.charAt(m);
		}
		if(pal.equals(rev))
		{
			if(pal.length()!=1)
			{
				l.add(pal);
			}
		}
			}
		}
		if(l.size()==0)
		{
			System.out.println("No string found");
		}
		else
		{
			System.out.print(l);
		}
	
	}
}