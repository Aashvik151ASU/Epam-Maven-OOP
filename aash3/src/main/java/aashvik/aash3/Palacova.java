
package aashvik.aash3;

public class Palacova implements Sw
{
	String name;
	int cost;
	public Palacova()
	{
		setCost(50);
	}
	public void setCost(int cost)
	{
		this.cost=cost;
	}
	public int getCost()
	{
		return cost;
	}
}