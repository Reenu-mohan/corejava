abstract class person2
{ public boolean didYouSpeak()
	{
	return true;
	}
	public abstract boolean whatDoYouDo();
}
 class trainer5  extends person2
{ 
	@Override
	public boolean whatDoYouDo()
	{
		System.out.println("trainer,delivers lectures");
		return true;
	}
	
	
	}
 class doctor  extends person2
{ 
	@Override
	public boolean whatDoYouDo()
	{
		System.out.println("doctor,cure ill");
		return true;
	}
	
	
	}
 class pilot  extends person2
{ 
	@Override
	public boolean whatDoYouDo()
	{
		System.out.println("flies the airplane");
		return true;
	}
	
	
	}
public class abstractdemo2 {

	public static void main(String[] args) {
		trainer5 t=new trainer5();		
		doctor d= new doctor();
		pilot p= new pilot();
		System.out.println("trainer,did you speak? "+t.didYouSpeak()); 
		System.out.println(t.whatDoYouDo());   
		System.out.println("doctor,did you speak? "+d.didYouSpeak()); 
		System.out.println(d.whatDoYouDo());  
		System.out.println("pilot, did you speak? "+p.didYouSpeak()); 
		System.out.println(p.whatDoYouDo());  
	}

}
