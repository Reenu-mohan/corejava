
public class student {

	double m1,m2,m3;
	String grade, result;
	public void calcgrade()
	{ 
	double sum=m1+m2+m3;
	
	double avg= sum/3;
		if (avg>90)
			grade="a";
		if((avg>80)&&(avg<89)) {
			grade="b";
			
		}
		if((avg>70)&&(avg<79)) {
			grade="c";
			
		}
	}
	
	public void calcresult()
	{
		if((m1>35)&&(m2>35)&&(m3>35))
			result="pass";
		else
			result="fail";	}
	public void display()
	{

		System.out.println("mark for english "+m1);
		System.out.println("mark for maths "+m2);
		System.out.println("mark for science "+m3);
		System.out.println("grade "+grade);
		System.out.println("result "+result);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		student s1=new student();
		s1.m1=98;
		s1.m2=85;
		s1.m3=75;
		s1.calcgrade();
		s1.calcresult();
		s1.display();
		
		
	}

}
