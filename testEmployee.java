
public class testEmployee {

	public static void main(String[] args) {
		employee em=new employee(12,"arjun",4000);
		
		double bonus=em.calculateBonus();
		System.out.println("bonus is "+bonus);
		employee.getCompany();
	}

}
