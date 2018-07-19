class emp1{
	int empid;
	String empname;
	String dept;
	double salary;
	address add;
	
	emp1(int empid,String empname,String dept,double salary,address add)
	{
		this.empid=empid;
		this.empname=empname;
		this.dept=dept;
		this.salary=salary;
		this.add=add;
		
	}
	public void print()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(dept);
		System.out.println(salary);
		add.printadd();
		
	}
}
class address{
	int flatnbr;
	String street;
	String road;
	long pincode;
	
	address(int flatnbr,String street,String road,long pincode)
	{
		this.flatnbr=flatnbr;
		this.street=street;
		this.road=road;
		this.pincode=pincode;
		
	}
	public void printadd()
	{
		System.out.println(flatnbr);
		System.out.println(street);
		System.out.println(road);
		System.out.println(pincode);
	}
}
public class hasademo {

	public static void main(String[] args) {
	
address a=new address(123,"thrmlprm","mcroad",689115L);
emp1 em=new emp1(12,"reenu","c&m",25000,a);
em.print();
	}

}
