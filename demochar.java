
public class demochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0,k=0;
		
		String s1=args[0];
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='c')
			    j++;
			}
			System.out.println("frequency of c is"+j);
			
			
			
			
			/////////////////////////////////////normal by hand
			
			
			
			
			String s="i am doing a programme ccccccc";
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='c')
					k++;
			}
			System.out.println("frequency of c is"+k);
			
			
			
			
			
			
			String name="reenu";
			
			for(int i=0;i<name.length();i++)
			{
				if(name.indexOf('e',i)==-1)
					break;
				if(i==name.indexOf('e',i))
				{
					System.out.println(i+1); 
				}
			}
			
			StringBuffer name1=new StringBuffer("deloitte");
			
			name1.append(" banglore ");
			System.out.println(name1);
			System.out.println(name1.append('a'));
			System.out.println(name1.reverse());
			
			String name6="reenu";
			char namearray[]=name6.toCharArray();

			for(int i=namearray.length-1;i>=0;i--)
			{
				System.out.print(namearray[i]);
			
			
			
			}
	
	
	
	}
	

}
