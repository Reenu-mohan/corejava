
public class passwordvalidator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String password="Reen& 3";
		boolean digit=false, upc=false,wh=false,sp=false, lt=false;
		if((password.length()<=10)&&(password.length()>=5) )
		{
		char passarray[]=password.toCharArray();
		
		for(int i=0;i<passarray.length;i++)
		{	char x=passarray[i];
			if(Character.isDigit(x))
			 digit = true;
			else	if(Character.isUpperCase(x))
				upc=true;
			else if(Character.isWhitespace(x))
				wh=true;
			else if(Character.isLetter(x))
				lt=true;
			else 
				sp=true;
		}
		if((digit&&upc&&sp)&&(!wh))
		{
			System.out.println("valid password");
		}
		else
			System.out.println("not valid password . Check if you have a uppercase letter and a special character and a digit and no white space");
			
		}
			
		else 
		{
			System.out.println("your password is only"+password.length()+" it must have to be min of 5 and max of 10");
		}
		}
	}
 

