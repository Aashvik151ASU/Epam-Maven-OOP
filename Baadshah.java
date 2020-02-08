
package epam.training.sweets;

public class Baadshah implements Sw
{
	String name;
	int cost;
	public Baadshah()
	{
		setCost(30);
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