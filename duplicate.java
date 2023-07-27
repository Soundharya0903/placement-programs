import java.util.*;
import java.util.LinkedList;
public class duplicate{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		LinkedList<String> ls=new LinkedList<>();
		int flag=0;
		System.out.print("Enter the word");
		String word=sc.next();
		for(int i=0;i<word.length();i++)
		{
			for(int j=i+1;j<word.length()+1;j++)
			{
				String sub=word.substring(i,j);
				for(int k=0;k<=sub.length();k++)
				{
					for(int l=k+1;l<sub.length();l++)
					{
						if(sub.charAt(k)==sub.charAt(l))
						{
							flag++;
							
						}
						}
				}
						
						if(flag==0)
						{
							ls.add(sub);
						}
			
		}}
	    System.out.println(ls);
		
		
}
}