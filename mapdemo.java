import java.util.*;


public class mapdemo {

	public static void main(String[] args) {
		
		System.out.println("***********HASH MAP***********");
		
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		HashMap hm= new HashMap();
		hm.put("1", "reenu");
		hm.put("2", "jilu");             //we can set the index as integer too... that time we have to maintain it in the program.
		hm.put("3", "athira");
		hm.put("5", "gopika");
		hm.put("4", "ibin");
		System.out.println(hm);
			
	/////////////////////
			
		System.out.println("Hash map "+hm.get("3"));
			
	//////////////////////	
			
		Set keys=hm.keySet();
		Iterator it=keys.iterator();
		
		while(it.hasNext())
		{
			String key=(String)it.next();                                  //use Integer instead of String for using the integer value as key element.
			System.out.println("using iterator "+hm.get(key));
		}
		
		
		
		//tree map
		
		
		System.out.println("**********TREE MAP***********");
		
		System.out.println();
		System.out.println();
		System.out.println();

		
		TreeMap tm= new TreeMap();
		tm.put("1", "reenu");
		tm.put("2", "jilu");             //we can set the index as integer too... that time we have to maintain it in the program.
		tm.put("3", "athira");
		tm.put("5", "gopika");
		tm.put("4", "ibin");
		System.out.println(tm);
			
	/////////////////////
			
		System.out.println("tree map "+tm.get("3"));
		
	//////////////////////	
		
	Set keys1=hm.keySet();
	Iterator it1=keys1.iterator();
	
	while(it1.hasNext())
	{
		String key=(String)it1.next();                                  //use Integer instead of String for using the integer value as key element.
		System.out.println("using iterator "+tm.get(key));
	}		
		
		
		
	
	
	
	//linked hash map
	
	
	System.out.println("************LINKED HASH MAP***********");
	
	
	System.out.println();
	System.out.println();
	System.out.println();

	
	LinkedHashMap lm= new LinkedHashMap();
	lm.put("1", "reenu");
	lm.put("2", "jilu");             //we can set the index as integer too... that time we have to maintain it in the program.
	lm.put("3", "athira");
	lm.put("5", "gopika");
	lm.put("4", "ibin");
	
	
	System.out.println(lm);
		
	/////////////////////
		
	System.out.println("linked hash map "+lm.get("3"));
	
	//////////////////////
	
		Set keys2=hm.keySet();
		Iterator it2=keys2.iterator();

		while(it2.hasNext())
		{
			String key=(String)it2.next();                                  //use Integer instead of String for using the integer value as key element.
			System.out.println("using iterator "+lm.get(key));
		}		
	
	
	
	
	}

}
