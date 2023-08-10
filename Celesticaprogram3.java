import java.util.Scanner;

/**
 *
 * @author User 1
 */
public class Celesticaprogram3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int cost=0;
       
        int test=sc.nextInt();
        int arr[]=new int[test];
        for(int i=0;i<test;i++){
            arr[i]=sc.nextInt();}
        for(int i=0;i<test;i++){
          int m1=arr[i]/2;
          int m2=arr[i]-m1;
     //   System.out.println(m1);
     //     System.out.println(m2);
        if(m2==0)
        {
          cost=m1*m1;    
        }
        else
        {
            cost=m1*m2;
        }
    //      System.out.println(cost);
        int cost1=0;
        int cost2=0;
        int m3=m1;
        for(int j=0;j<m1-1;j++)
        {
            cost1=cost1+(m3-1);
            m3--;
        }
  //      System.out.println(cost1+cost);
       // int m4=m2;
        if(m2==0)
        {
            cost=cost+cost1+cost1;
        }
        else{
            int m4=m2;
        
            for(int k=0;k<m2-1;k++){
                cost2=cost2+(m4-1);
                m4--;
        }
            cost=cost+cost1+cost2;
        }
        System.out.println(cost);
        }
        }  
    }  
