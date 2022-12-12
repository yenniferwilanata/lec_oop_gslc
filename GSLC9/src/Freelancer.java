/*
 * Each freelance must have
 * - commission
 * - tips 
 * - platform (assuming all freelancers are designers)
 */
public class Freelancer extends Profile {
	
	private int commission;
	private int tips;
	private String platform;
	
	public Freelancer(String name, int age, String gender, int commission, String platform, int tips) {
		super(name, age, gender);
		this.commission = commission;
		this.platform = platform;
		this.tips = tips;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}	

	public int getTips() {
		return tips;
	}

	public void setTips(int tips) {
		this.tips = tips;
	}

	@Override
	public int payment() {
		return tips + commission;
	}

	@Override
	public String toString() {
		return this.getName() + ", a" + this.getGender() + ", " + this.getAge() + " years old," + " is a" + 
				this.getClass().getSimpleName() + ". He/She likes to use the platform " + this.getPlatform() +  
				" to work." + " His/Her total income is $" + payment() + " consisting of commission and tips.";
	}

}
