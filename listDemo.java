import java.util.*;
public class listDemo {

	
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.add("java");
		ll.add("c#");
		ll.add("python");
		ll.add("html");
		ll.add("javaScript");

		
		
		
		System.out.println("normal display "+ll);
		
		
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.println("using for loop "+ll.get(i));
		}
		
		
		Iterator it=ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println("using iterator "+it.next());
		}
		
		
		
		ListIterator lt=ll.listIterator();
		while(lt.hasNext())
		{
			System.out.println("using list iterator next "+lt.next());
			
		}
		while(lt.hasPrevious())
		{
			System.out.println("using list iterator previous "+lt.previous());
		}
	}
}
