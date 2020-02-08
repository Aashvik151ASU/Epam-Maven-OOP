
package epam.training.sweets;

public class Rasgulla implements Sw
{
	String name;
	int cost;
	public Rasgulla()
	{
		setCost(70);
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