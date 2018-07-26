import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class listarraydemo {

	public static void main(String[] args) 
	{
	ArrayList al=new ArrayList();
	al.add(1);
	al.add(2);
	al.add(5);
	al.add(6);
	al.add(3);
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	System.out.println(Collections.binarySearch(al,5));
	
	
	ArrayList a2=new ArrayList();
	a2.add(0);
	a2.add(5);
	a2.add(0);
	a2.add(5);
	a2.add(0);
	System.out.println(a2);
	Collections.sort(a2);
	Collections.copy(al, a2);
	System.out.println(al);
	System.out.println("break");
	System.out.println(al.retainAll(a2)); 
	System.out.println("break");
	System.out.println(al);
	System.out.println(a2);
	System.out.println(al.addAll(a2)); 
	System.out.println(al);
	
	HashSet hs = new HashSet();
	hs.addAll(al);
	al.clear();
	al.addAll(hs);
	
	System.out.println(al);
	
	
	
	
	}
	
	
	
	
	
	
	

}