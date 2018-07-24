import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("jilu");
		a.add("athira");
		a.add("gopika");
		a.add("ibin");
		a.add("aflu");
		a.add("abhi");
		a.add(10);
		a.add(100);
		a.add(89);
		a.add(10.25);
		int sum=0;
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i));
		a.remove(1);
		for(int i=0;i<a.size();i++)
			System.out.println(a.get(i)); 
		for(int i=0;i<a.size();i++)
		{
			 if (a.get(i) instanceof Integer) {
				Integer nn = (Integer)a.get(i) ;
				 sum=sum+ nn;
				 
				
			}
			
		} System.out.println("sum of integer values"+sum);
	}

}
