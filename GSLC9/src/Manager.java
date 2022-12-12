/*
 * Each manager must have
 * - division
 */
public class Manager extends Employee {

	private String division;
	
	public Manager(String name, int age, String gender, String companyName, String workingHours, int salary, int bonus,
			String division) {
		super(name, age, gender, companyName, workingHours, salary, bonus);
		this.division = division;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	@Override
	public int payment() {
		return this.getSalary() + this.getBonus();
	}

	@Override
	public String toString() {
		return this.getName() + ", a" + this.getGender() + ", " + this.getAge() + " years old," + " is a" + 
				this.getClass().getSimpleName() + " at " + this.getCompanyName() + " in the " + this.getDivision() 
				+ " division." + " His/Her total payment is $" + payment() + " consisting of salary and bonus.";
	}

}
