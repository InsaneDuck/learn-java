package introduction.exceptions.product;

public class Product
{
	private static int idgen=0;
	private int id;
	private float weight;
	private float price;
	public Product(float weight, float price)
	{
		idgen++;
		this.id=idgen;
		this.weight = weight;
		this.price = price;
	}
	public int getId()
	{
		return id;
	}
	public float getPrice()
	{
		return price;
	}
	public float getWeight()
	{
		return weight;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	@Override
	public String toString()
	{
		return "Product [id=" + id + ", weight=" + weight + ", price=" + price + "]";
	}
}
