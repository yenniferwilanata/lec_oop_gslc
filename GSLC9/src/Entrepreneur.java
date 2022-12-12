/*
 * Each Entrepreneur must have:
 * - field (the field that they're working on: Food and Beverage OR Fashion)
 * - sales in a year
 * - profit in a year
 */
public class Entrepreneur extends Profile {
	
	private String field;
	private int sales;
	private int profit;

	public Entrepreneur(String name, int age, String gender, String field, int sales, int profit) {
		super(name, age, gender);
		this.field = field;
		this.sales = sales;
		this.profit = profit;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	@Override
	public int payment() {
		return (int)((sales-profit)*0.20);
	}

	@Override
	public String toString() {
		return this.getName() + ", a " + this.getGender() + ", " + this.getAge() + " years old, is an" + 
				this.getClass().getSimpleName() + " with sales of $" + this.getSales() + " and profit of $" + 
				this.getProfit() + ". His/Her income is $" + payment() + " per year.";
	}

}
