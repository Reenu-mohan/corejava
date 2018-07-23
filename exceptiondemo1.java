
public class exceptiondemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(5/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("cant divide by zero");
		}
		System.out.println("end");

	}

}
