/*
 * Make a menu to see whether the user wants to 
 * 1. Insert
 * 2. View
 * 3. Delete
 * 4. Exit
 * 
 * For each Insert, there are several 
 */
import java.util.*;

public class Main {
	Vector <Profile> profile = new Vector<>();
	Scanner scan = new Scanner(System.in);
	
	public Main() {
		int menu;
		int menu1;
		while(true) {
			System.out.println("1. Insert Data");
			System.out.println("2. View Data");
			System.out.println("3. Delete Data");
			System.out.println("4. Exit");
			menu = scan.nextInt(); scan.nextLine();
			if (menu == 1) {
				while(true) {
					System.out.println("1. Entrepreneur");
					System.out.println("2. Manager");
					System.out.println("3. HRD");
					System.out.println("4. Freelancer");
					menu1 = scan.nextInt(); scan.nextLine();
					if (menu1 >= 1 && menu1 <= 4) {
						break;
					}
				}
				if (menu1 == 1) {
					System.out.print("Insert Name: ");
					String name = scan.nextLine();
					System.out.print("Insert Age: ");
					int age = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Gender: ");
					String gender = scan.nextLine();
					System.out.print("Insert Field: ");
					String field = scan.nextLine();
					System.out.print("Insert Sales: ");
					int sales = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Profit: ");
					int profit = scan.nextInt(); scan.nextLine();
					profile.add(new Entrepreneur(name, age, gender, field, sales, profit));
				}
				else if (menu1 == 2) {
					System.out.print("Insert Name: ");
					String name = scan.nextLine();
					System.out.print("Insert Age: ");
					int age = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Gender: ");
					String gender = scan.nextLine();
					System.out.print("Insert Company Name: ");
					String companyName = scan.nextLine();
					System.out.print("Insert Working Hours: ");
					String workingHours = scan.nextLine();
					System.out.print("Insert Salary: ");
					int salary = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Bonus: ");
					int bonus = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Division: ");
					String division = scan.nextLine();
					profile.add(new Manager(name, age, gender, companyName, workingHours, salary, bonus, division));
				}
				else if (menu1 == 3) {
					System.out.print("Insert Name: ");
					String name = scan.nextLine();
					System.out.print("Insert Age: ");
					int age = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Gender: ");
					String gender = scan.nextLine();
					System.out.print("Insert Company Name: ");
					String companyName = scan.nextLine();
					System.out.print("Insert Working Hours: ");
					String workingHours = scan.nextLine();
					System.out.print("Insert Salary: ");
					int salary = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Bonus: ");
					int bonus = scan.nextInt(); scan.nextLine();
					profile.add(new HRD(name, age, gender, companyName, workingHours, salary, bonus));
				}
				else if (menu1 == 4) {
					System.out.print("Insert Name: ");
					String name = scan.nextLine();
					System.out.print("Insert Age: ");
					int age = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Gender: ");
					String gender = scan.nextLine();
					System.out.print("Insert Commission: ");
					int commission = scan.nextInt(); scan.nextLine();
					System.out.print("Insert Platform: ");
					String platform = scan.nextLine();
					System.out.print("Insert Tips: ");
					int tips = scan.nextInt(); scan.nextLine();
					profile.add(new Freelancer(name, age, gender, commission, platform, tips));
				}
				System.out.println("You have successfully insert data!");
			}
			else if (menu == 2) {
				int j = 1;
				for (Profile i : profile) {
					System.out.println(j++ + ". " + i.toString()+"\n");
				}
			}
			else if (menu == 3) {
				int delete;
				int j = 1;
				for (Profile i : profile) {
					System.out.println(j++ + ". " + i.toString()+"\n");
				}
				do {
					System.out.print("Insert data number you want to delete: ");
					delete = scan.nextInt(); scan.nextLine();
				}while (delete < 1 || delete > profile.size());
				profile.remove(delete-1);
				System.out.println("You have successfully deleted data!");
			}
			else if (menu == 4) {
				System.exit(0);
			}
		}
	}
	
	public static void main (String[] args) { 
		new Main();
	}
}
