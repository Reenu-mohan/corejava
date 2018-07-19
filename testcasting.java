class employee1{
public void emp() {
	System.out.println("employee");
}}



class hr extends employee1{
	public void hemp() {
	System.out.println("hr extends employee");
}}


class technical extends employee1
{public void temp() {
	System.out.println("technical extends employee");
}
}
class recruiter extends hr{ 
	public void rhemp() {
		System.out.println("recruiter extends hr extends employee");
	}
}
class finance extends hr{}
class javapm extends technical{
}
class mainframepm extends technical{}

		

public class testcasting {

	public static void main(String[] args) {
	
		//up casting
		
		technical t=new javapm();
	t.emp();
	hr h=new recruiter();
	h.emp();
	employee1 e=new hr();
	e.emp();
	employee1 e1=new mainframepm();
	mainframepm m=new mainframepm();
	
	
	e1.emp();
	// e1.temp(); not possible since e1 is hold by employee
	m.emp();
	m.temp(); //possible since m is the object of mainframepm which extended from technical .
	  
	
	
	//down casting

	technical t1=new javapm();
	javapm jp=(javapm) t1;
	t1.emp();
	jp.emp();
	
	
	
	}

}
