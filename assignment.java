import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
public class assignment {

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
	System.out.println(a2);
	System.out.println(al.addAll(a2)); 													// for append  2 arraylist
	System.out.println(al);
	
	System.out.println("  Retain break   ");
	al.retainAll(a2);
	System.out.println("a1  "+al);
	System.out.println("a2 "+a2);
	
	System.out.println("   Hash break   ");
	
	HashSet hs = new HashSet();															//	for only append distinct values ti arraylist
	hs.addAll(al);
	al.clear();
	al.addAll(hs);
	
	System.out.println(al);
	System.out.println("break");
	//a2 = Collections.unmodifiableList(a2);
	// a2.add(1);
	// System.out.println(a2);
	//a2.add(2,10);
	//System.out.println(a2);
	
	
	 List objList = new ArrayList();
     objList.add(4);
     objList.add(5);
     objList.add(6);
     objList.add(7);

     objList = Collections.unmodifiableList(objList);									//unmodifiying a array list only reading privilage
     System.out.println("List contents " + objList);
     
     objList.add(2,10);
     System.out.println("List contents " + objList);
     
     
     
	}
	
	
	
	
	
	
	
	
	

}
 