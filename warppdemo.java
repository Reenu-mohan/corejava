
public class warppdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="char have to be readed 12## ";
		
		
		char carry[]=data.toCharArray();
		for(int i=0;i<carry.length;i++)
		{
			char x=carry[i];
			if (Character.isDigit(x))
			{
				System.out.println(x+"is a digit");
			}
			else if(Character.isLetter(x))
			{System.out.println(x+"is a letter");}
			else if(Character.isWhitespace(x))
				System.out.println(x+"is a whitespace");
			else
				System.out.println(x+"is a special character");
		}
		//Character c1= new Character(char);
	}

}
