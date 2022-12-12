/* 
 * Special case for HRD, they are able to fire worker!
 */
import java.util.Vector;

public class HRD extends Employee implements FireEmployee {
	
	public HRD(String name, int age, String gender, String companyName, String workingHours, int salary,
			int bonus) {
		super(name, age, gender, companyName, workingHours, salary, bonus);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int payment() {
		return this.getSalary() + this.getBonus();
	}

	@Override
	public String toString() {
		return this.getName() + ", a" + this.getGender() + ", " + this.getAge() + "years old," + "is an Employee at" 
				+ this.getCompanyName() + "in the Human Resource Development division." 
				+ "His/Her total payment is $" + payment() + "consisting of salary and bonus.";
	}

	@Override
	public void fireEmployee(Employee employee, Vector data) {
		data.remove(employee);
	}

}
