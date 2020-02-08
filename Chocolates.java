
package epam.training.sweets;

public class Chocolates implements Sw
{
	String name;
	int cost;
	public Chocolates()
	{
		setCost(20);
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