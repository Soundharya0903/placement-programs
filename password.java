import java.util.*;
public class password{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your user name");
		String username=sc.next();
		System.out.println("Enter you password");
		String password=sc.next();
		//String[] pass=password.split("\\");
		//System.out.println(Arrays.toString(pass));
		char pass[]=new char[password.length()];
		int num[]=new int[password.length()];
		int n=pass.length;
		for(int i=0;i<n;i++)
		{
			pass[i]=password.charAt(i);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(pass[i]);
		}
		int count1=0, count2=0, count3=0, count4=0;
		for(int i=0;i<n;i++){
			if(Character.isUpperCase(pass[i]))
			{
				
				if(count1<1)
				{
                count1++;
				continue;
				}
			}
			if(Character.isLowerCase(pass[i]))
			{
				
				if(count2<1)
				{
					count2++;
					continue;
				}
			}
			if(Character.isDigit(pass[i]))
			{
				for(int j=0;j<i;j++)
				{
					num[i]=pass[i];
				}
				if(count3<1)
				{
					count3++;
					continue;
				}
			}
			if(pass[i]=='@' || pass[i]=='$' || pass[i]=='^' || pass[i]=='*')
			{
				
				if(count4<1)
				{
					count4++;
					continue;
				}
			}
			
		
	}
	int sum=0;
	sum=count1+count2+count3+count4;
	System.out.println(sum);
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
	}
}