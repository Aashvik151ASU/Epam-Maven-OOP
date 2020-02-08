
package epam.training.sweets;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner x=new Scanner(System.in);
    	System.out.print("Enter number of sweets : ");
    	int n=x.nextInt();
    	int rows;
    	int sum=0;
    	for(rows=0;rows<n;rows++)
    	{
    		System.out.print("Enter the sweet name : ");
    		String sweetname=x.nextLine();
    		Sw s;
    		if(sweetname.equals("Palacova"))
    			s=new Palacova();
    		else if(sweetname.equals("Baadshah"))
    			s=new Baadshah();
    		else if(sweetname.equals("Chocolates"))
    			s=new Chocolates();
    		else if(sweetname.equals("Rasgulla"))
    			s=new Rasgulla();
    		else
    		{
    			System.out.println("Sorry no sweet found with this name ");
    			rows--;
    			continue;
    		}
    		System.out.println("Number of kg's needed : ");
    		int kg=x.nextInt();
    		sum+=s.getCost()*kg;
    	}
    	System.out.println("Total amount to be paid is : "+sum);
    }
}
