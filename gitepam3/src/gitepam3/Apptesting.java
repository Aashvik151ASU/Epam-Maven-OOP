package gitepam3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTesting
{
    @Test
    public void testingConstructionprice()
    {
    	ConstructionCost  constructioncostofhouse=new Constructionprice("normal",30,"no");
    	double res=constructioncostofhouse.estimatedCostOfConstruction();
        assertEquals(36000,res,0);
    }
    @Test
    public void testingSI()
    {
    	CalculateInterest  interest=new CalculateInterest(1000,2,3);
    	double res=interest.calculateSI();
        assertEquals(60,res,0);
    }
    @Test
    public void testingCI()
    {
    	CalculateInterest  interest=new CalculateInterest(1000,1,3);
    	double res=interest.calculateCI();
        assertEquals(30,res,1);
    }
}
