class employee0 implements comparison
{int empid;
double salary;
employee0(int empid,double salary)
{this.empid=empid;
this.salary=salary;

	}
public void whichisgeater(Object o1,Object o2)
{
employee0 em=(employee0)o1 ;
employee0 em1=(employee0)o2;

if(em.salary>em1.salary)
{System.out.println(em.empid+"  is greater");
	}
else
	System.out.println(em1.empid+"  is greater");
}

	}
class apple implements comparison
{String source;
double price;
apple (String source,double price)
{
	this.source=source;
	this.price=price;
	
}

public void whichisgeater(Object o1,Object o2)
{
apple a1=(apple)o1;
apple a2=(apple)o2 ;

if(a1.price>a2.price)
{System.out.println(a1.source+" apple is greater");
	}
else
	System.out.println(a2.source+" apple is greater");
}

	}
public class testinterfacecomparison {

	public static void main(String[] args) {
		employee0 e1=new employee0(1,25000.00);
		employee0 e2=new employee0(2,22000.00);
		employee0 e3=new employee0(0,0.0);
		e3.whichisgeater(e1, e2);
	
		
		apple a=new apple("kashmiri",250.00);
		apple b=new apple("ilhabadhi",700.00);
		apple c=new apple(null,0.0);
		c.whichisgeater(a,b);
		
	}

}
