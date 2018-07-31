class places implements Cloneable{
	String name;
	String country;
	long popoulation;
	public places(String name,String country,long popoulation)
	{
		super();
		this.name=name;
		this.country=country;
		this.popoulation=popoulation;
		
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
		
	}
	
} 
public class clonedemo {

	public static void main(String[] args) {
		places p1=new places("mumbai","india",9872256L);
		System.out.println(p1);
		places p2=null;
		
		try {
			p2=(places)p1.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("cloning is not avialable for this object");
			e.printStackTrace();
		}
	
		p1.country="USA";
		System.out.println(p1.country);
		System.out.println(p2.country);
		}

}
