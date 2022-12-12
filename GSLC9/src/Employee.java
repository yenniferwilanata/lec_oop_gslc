/*
 * Each Employee must have 
 * - company name
 * - working hours
 * - salary
 * - bonus
 */
abstract public class Employee extends Profile {
	
	private String companyName;
	private String workingHours;
	private int salary;
	private int bonus;
	
	public Employee(String name, int age, String gender, String companyName, String workingHours, int salary,
			int bonus) {
		super(name, age, gender);
		this.companyName = companyName;
		this.workingHours = workingHours;
		this.salary = salary;
		this.bonus = bonus;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}
	
}
