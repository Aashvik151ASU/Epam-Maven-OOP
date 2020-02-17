package gitepam3;

public class SICI {
		double principleamount,interest,rateofinterest,time;
		CalculateInterest(double principle,double rate,double time)
		{
			this.principleamount=principle;
			this.rateofinterest=rate;
			this.time=time;
		}
		double calculateSI()
		{
			interest=(principleamount*time*rateofinterest)/100;
			return interest;
		}
		double calculateCI()
		{
			interest=principleamount*(Math.pow((1+(rateofinterest/100)),time))-principleamount;
			return interest;
		}

}
