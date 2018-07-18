

public class band {

	String bandName;
	String singers[]  ;
	String gutarist[];
	String keyboardPlayer;
	
	public void setBandDetails(String bandName,String[] singers, String[] gutarist, String keyboardPlayer )
	{
		this.bandName=bandName;
		this.singers=singers;
		this.gutarist=gutarist;
		this.keyboardPlayer=keyboardPlayer;
		
		
	} 
	public void printBandDeatils()
	{System.out.println(bandName);
	for(int i=0;i<singers.length;i++)
		
	{System.out.println(singers[i]);}
	for(int j=0;j<gutarist.length;j++)
	System.out.println(gutarist[j]);
	System.out.println(keyboardPlayer);
	}
	public int countMembers()
	{ 
		return 2+singers.length+gutarist.length;
		
	}
	
	
	
}
