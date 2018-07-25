import java.util.*;
public class setdemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("aflak");
		hs.add("ibin");
		//hs.add("reenu");
		hs.add("jilu");
		hs.add("athira");
		hs.add("abhi");
		hs.add("abin");   
		hs.add("gopika");
		hs.add("reenu");
		System.out.println(hs);
		
		TreeSet ts=new TreeSet();
		ts.add("aflak");
		ts.add("ibin");
		//hs.add("reenu");
		ts.add("jilu");
		ts.add("athira");
		ts.add("abhi");
		ts.add("abin");   
		ts.add("gopika");
		ts.add("reenu");
		System.out.println(ts);
		
		LinkedHashSet ls=new LinkedHashSet();
		ls.add("ibin");
		ls.add("reenu");
		ls.add("jilu");
		ls.add("athira");
		ls.add("abhi");
		ls.add("abin");   
		ls.add("gopika");
		ls.add("reenu");
		System.out.println(ls);
		
	}

}
