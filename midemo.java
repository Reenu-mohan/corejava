class a1
{int a=50;
public int returna()
{ return a;
	}}
class b extends a1{
	int b=25;
	int a=5;
	
}
class c extends b{
	int c=75;
	
}
public class midemo {

	public static void main(String[] args) {
		 c c1= new c();
System.out.println(c1.a);
System.out.println(c1.returna());
System.out.println(((a1)c1).a);

	}

}
