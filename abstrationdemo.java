abstract class person
{
	public boolean doeshebreath()
	{ 	System.out.println("every humans breath");
  		return true;

	}
	public boolean doeshesleep()
	{ 	
		System.out.println("every humans sleep");
		return true;

	}
	public abstract boolean doeshedrivecar();

}

abstract class employeer extends person
{
		public abstract boolean doeshedrivecar();
}


class driver extends employeer
{		@Override
		public boolean doeshedrivecar()
		{
			System.out.println("every driver driver car");
			return true;
		}
}
public class abstrationdemo 
{

		public static void main(String[] args) 
		{
			driver d= new driver();
			System.out.println("breath? "+d.doeshebreath()); 
			System.out.println("sleep? "+d.doeshesleep()); 
			System.out.println("drives a car? "+d.doeshedrivecar()); 

		}

}
