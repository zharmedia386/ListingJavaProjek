package Task3_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee implements Sortable{
	private String secretaryName;
	
	public Manager(String name, double salary, int hireday, int hiremonth, int
	hireyear) {
		super(name, salary, hireday, hiremonth, hireyear);
		secretaryName = "";
	}
	
	@Override
	public void raiseSalary(double byPercent) {
	// add 1/2% bonus for every year of service
		GregorianCalendar todaysDate = new GregorianCalendar();
		int currentYear = todaysDate.get(Calendar.YEAR);
		double bonus = 0.5 * (currentYear - hireyear());
		super.raiseSalary(byPercent + bonus);
	}
	
	public String getSecretaryName() {
		return secretaryName;
	}
}