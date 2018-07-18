
public class salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal=15000 , tax, allw,netsal;
		tax= sal/10;
		allw=sal/15;
		netsal=sal-tax+allw;
	
		System.out.println("salary ="+sal);
		System.out.println("tax ="+tax);
		System.out.println("allowance = "+allw);
		System.out.println("net salary="+netsal);
	}

}
