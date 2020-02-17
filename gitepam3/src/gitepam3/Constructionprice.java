package gitepam3;

public class Constructionprice {
		String standardofmat;
		double areaofhouse,costestimated;
		String automatedhouse;
		Constructionprice(String standardofmaterial,double areaofhouse,String automatedhouse)
		{
			this.standardofmaterial=standardofmaterial;
			this.areaofhouse=areaofhouse;
			this.automatedhouse=automatedhouse;
		}
		double estimatedCostOfConstruction()
		{
			if(standardofmaterial.equals("normal"))
			{
				costestimated=1200*areaofhouse;
			}
			else if(standardofmaterial.equals("above"))
			{
				costestimated=1500*areaofhouse;
			}
			else if(standardofmaterial.equals("high"))
			{
				if(automatedhouse.equals("yes"))
				{
					costestimated=2500*areaofhouse;
				}
				else
				{
					costestimated=1800*areaofhouse;
				}
			}
			return costestimated;
		
	
}
